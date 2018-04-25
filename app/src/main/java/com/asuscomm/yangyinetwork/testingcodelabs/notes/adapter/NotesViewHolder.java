package com.asuscomm.yangyinetwork.testingcodelabs.notes.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.asuscomm.yangyinetwork.testingcodelabs.R;
import com.asuscomm.yangyinetwork.testingcodelabs.data.Note;
import com.asuscomm.yangyinetwork.testingcodelabs.notes.NoteItemListener;

public class NotesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView title;

    public TextView description;
    private ItemListener mItemListener;

    public NotesViewHolder(View itemView, ItemListener listener) {
        super(itemView);
        mItemListener = listener;
        title = itemView.findViewById(R.id.note_detail_title);
        description = itemView.findViewById(R.id.note_detail_description);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mItemListener.onItemClick(getAdapterPosition());

    }
}