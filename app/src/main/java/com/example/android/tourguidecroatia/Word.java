package com.example.android.tourguidecroatia;

/**
 * Created by djalél on 10/06/2018.
 */

public class Word {

    /** Default translation for the word */
    private int mTitle;

    /** Miwok translation for the word */
    private int mDescription;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     /**
     * Create a new Word object.
     *
     * @param title is the word in a language that the user is already familiar with
     * (such as English)
     * @param description is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(int title, int description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;

    }


    /**
     * Get the default translation of the word.
     */
    public int gettitle() {
        return mTitle;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public int getdescribtion() {
        return mDescription;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    @Override
    public String toString() {
        return "Word{" +
                "mTitle='" + mTitle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}

