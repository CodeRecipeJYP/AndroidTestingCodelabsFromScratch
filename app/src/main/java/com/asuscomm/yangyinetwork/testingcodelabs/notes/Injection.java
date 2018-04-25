package com.asuscomm.yangyinetwork.testingcodelabs.notes;

import com.asuscomm.yangyinetwork.testingcodelabs.data.FakeNotesServiceApiImpl;
import com.asuscomm.yangyinetwork.testingcodelabs.data.NoteRepositories;
import com.asuscomm.yangyinetwork.testingcodelabs.data.NotesRepository;
import com.asuscomm.yangyinetwork.testingcodelabs.utils.FakeImageFileImpl;
import com.asuscomm.yangyinetwork.testingcodelabs.utils.ImageFile;

public class Injection {
    public static ImageFile provideImageFile() {
        return new FakeImageFileImpl();
    }

    public static NotesRepository provideNotesRepository() {
        return NoteRepositories.getInMemoryRepoInstance(new FakeNotesServiceApiImpl());
    }
}
