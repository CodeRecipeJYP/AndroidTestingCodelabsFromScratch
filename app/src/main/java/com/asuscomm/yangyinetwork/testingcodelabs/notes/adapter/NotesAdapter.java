package com.asuscomm.yangyinetwork.testingcodelabs.notes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asuscomm.yangyinetwork.testingcodelabs.R;
import com.asuscomm.yangyinetwork.testingcodelabs.data.Note;
import com.asuscomm.yangyinetwork.testingcodelabs.notes.NoteItemListener;

import java.util.List;

import static com.asuscomm.yangyinetwork.testingcodelabs.utils.NullUtils.checkNotNull;

public class NotesAdapter extends RecyclerView.Adapter<NotesViewHolder>  {
    private List<Note> mNotes;
    private NoteItemListener mItemListener;

    public NotesAdapter(List<Note> notes, NoteItemListener itemListener) {
        setList(notes);
        mItemListener = itemListener;
    }

    @Override
    public NotesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View noteView = inflater.inflate(R.layout.item_note, parent, false);

        return new NotesViewHolder(noteView, (position) -> mItemListener.onNoteClick(getItem(position)));
    }

    @Override
    public void onBindViewHolder(NotesViewHolder viewHolder, int position) {
        Note note = mNotes.get(position);

        viewHolder.title.setText(note.getTitle());
        viewHolder.description.setText(note.getDescription());
    }

    public void replaceData(List<Note> notes) {
        setList(notes);
        notifyDataSetChanged();
    }

    private void setList(List<Note> notes) {
        mNotes = checkNotNull(notes);
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public Note getItem(int position) {
        return mNotes.get(position);
    }
}
