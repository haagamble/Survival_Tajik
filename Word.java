package com.talktajiktoday.survivaltajik;

/**
 * Created by Heather on 24/06/2017.
 * This class defines what a word is - the English and Tajik translations
 * And any associated images or sound files
 */
public class Word {
    private String mEnglishTranslation;
    private String mTajikTranslation;
    //some Words will contain images
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    //adding this June 26th
    //trying to add the transliteration
    //some Words will contain the Tajik in Latin
    private String mTajikInLatin = NO_LATIN;
    private static final String NO_LATIN = "none";
    //some sections need a heading; just use a word object with one parameter
    //this has no logic associated with it as of June 27th
    //this string is not used anywhere as of June 27th
    private String mSubjectHeading;




    /**
     * This is the constructor for words that just have two strings.
     * English translation and Tajik translation
     *
     * @param englishTranslation
     * @param tajikTranslation
     */
    public Word(String englishTranslation, String tajikTranslation){
        mEnglishTranslation = englishTranslation;
        mTajikTranslation = tajikTranslation;
    }

    /**
     * This is the constructor for words with three strings.
     * The Tajik in Latin script is included.
     * Goal is for all words and phrases to have this third string.
     * @param englishTranslation
     * @param tajikTranslation
     * @param tajikInLatin
     */

    public Word(String englishTranslation, String tajikTranslation, String tajikInLatin){
        mEnglishTranslation = englishTranslation;
        mTajikTranslation = tajikTranslation;
        mTajikInLatin = tajikInLatin;
    }

    /**
     * This is the constructor for words with two strings and an image
     * note that the image is passed in as an int - its id
     *
     * @param englishTranslation
     * @param tajikTranslation
     * @param imageResourceId
     */
    public Word(String englishTranslation, String tajikTranslation, int imageResourceId){
        mEnglishTranslation = englishTranslation;
        mTajikTranslation = tajikTranslation;
        mImageResourceId = imageResourceId;

    }

    /**
     * This is the constructor for words with three strings and an image
     * note that the image is passed in as an int - its id
     *
     * @param englishTranslation
     * @param tajikTranslation
     * @param imageResourceId
     * @param tajikInLatin
     */
    public Word(String englishTranslation, String tajikTranslation, String tajikInLatin, int imageResourceId){
        mEnglishTranslation = englishTranslation;
        mTajikTranslation = tajikTranslation;
        mTajikInLatin = tajikInLatin;
        mImageResourceId = imageResourceId;

    }

    public Word(String subjectHeading){
        mSubjectHeading = subjectHeading;

    }

    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public String getTajikTranslation(){
        return mTajikTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getTajikInLatin() { return mTajikInLatin;}

    public String getSubjectHeading(){
        return mSubjectHeading;
    }

    //if the mImageResourceId is not equal to -1 then true is returned.
    //in other words, if true is returned that means that there is an image.
    //if there is no image then false is returned.
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }

    //if the word has a Latin letter transliteration then true is returned
    //if there is no transliteration then false is returned
    public boolean hasLatin() { return !mTajikInLatin.equals("none");}


}
