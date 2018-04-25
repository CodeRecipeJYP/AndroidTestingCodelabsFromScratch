package com.asuscomm.yangyinetwork.testingcodelabs.data;

import android.support.annotation.Nullable;

import java.util.Objects;
import java.util.UUID;

public class Note {
    private final String mId;
    @Nullable
    private final String mTitle;
    @Nullable
    private final String mDescription;
    @Nullable
    private final String mImageUrl;

    public Note(@Nullable String title, @Nullable String description) {
        this(title, description, null);
    }

    public Note(@Nullable String title, @Nullable String description, @Nullable String imageUrl) {
        mId = UUID.randomUUID().toString();
        mTitle = title;
        mDescription = description;
        mImageUrl = imageUrl;
    }

    public String getId() {
        return mId;
    }

    @Nullable
    public String getTitle() {
        return mTitle;
    }

    @Nullable
    public String getDescription() {
        return mDescription;
    }

    @Nullable
    public String getImageUrl() {
        return mImageUrl;
    }

    public boolean isEmpty() {
        return (mTitle == null || "".equals(mTitle)) &&
                (mDescription == null || "".equals(mDescription));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(mId, note.mId) &&
                Objects.equals(mTitle, note.mTitle) &&
                Objects.equals(mDescription, note.mDescription) &&
                Objects.equals(mImageUrl, note.mImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId, mTitle, mDescription, mImageUrl);
    }
}
