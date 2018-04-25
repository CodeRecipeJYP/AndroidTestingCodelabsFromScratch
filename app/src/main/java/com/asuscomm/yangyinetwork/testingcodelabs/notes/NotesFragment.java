package com.asuscomm.yangyinetwork.testingcodelabs.notes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.asuscomm.yangyinetwork.testingcodelabs.data.Note;
import com.asuscomm.yangyinetwork.testingcodelabs.notes.adapter.NotesAdapter;

import java.util.ArrayList;
import java.util.List;

public class NotesFragment extends Fragment implements NotesContract.View {
    private NotesAdapter mListAdapter;
    private NotesContract.UserActionsListener mActionsListener;
    NoteItemListener mItemListener = clickedNote -> mActionsListener.openNoteDetails(clickedNote);

    public NotesFragment() {
    }

    public static NotesFragment newInstance() {
        return new NotesFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListAdapter = new NotesAdapter(new ArrayList<Note>(0), mItemListener);
        mActionsListener = new NotesPresenter(Injection.provideNotesRepository(), this);
    }

    @Override
    public void setProgressIndicator(boolean active) {

    }

    @Override
    public void showNotes(List<Note> notes) {

    }

    @Override
    public void showAddNote() {

    }

    @Override
    public void showNoteDetailUi(String noteId) {

    }
}
