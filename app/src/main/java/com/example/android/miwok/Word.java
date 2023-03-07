package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mResourceId = -1;

    private int mAudioResourceId ;



    public Word(String defaultTranslation ,String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation ,String miwokTranslation , int resouceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resouceId;
        mAudioResourceId = audioResourceId;

    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mResourceId=" + mResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    public  String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmResourceId(){ return  mResourceId;}

    public int getmAudioResourceId(){ return mAudioResourceId;}

    public boolean hasImage(){
        return mResourceId!=-1;
    }
}
