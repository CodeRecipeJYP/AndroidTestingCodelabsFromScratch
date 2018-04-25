package com.asuscomm.yangyinetwork.testingcodelabs.notes;

import android.support.annotation.NonNull;

import com.asuscomm.yangyinetwork.testingcodelabs.data.Note;
import com.asuscomm.yangyinetwork.testingcodelabs.data.NotesRepository;

import static com.asuscomm.yangyinetwork.testingcodelabs.utils.NullUtils.checkNotNull;

public class NotesPresenter implements NotesContract.UserActionsListener {
    private final NotesRepository mNotesRepository;
    private final NotesContract.View mNotesView;

    public NotesPresenter(
            @NonNull NotesRepository mNotesRepository, @NonNull NotesContract.View mNotesView) {
        this.mNotesRepository = checkNotNull(mNotesRepository);
        this.mNotesView = checkNotNull(mNotesView);
    }

    @Override
    public void loadNotes(boolean forceUpdate) {

    }

    @Override
    public void addNewNote() {

    }

    @Override
    public void openNoteDetails(@NonNull Note requestedNote) {

    }
}
