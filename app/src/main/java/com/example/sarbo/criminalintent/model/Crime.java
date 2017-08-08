package com.example.sarbo.criminalintent.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by sarbo on 7/27/2017.
 */

public class Crime {

    private UUID mId; // UUID is a java utility class included in the Andorid framework.
                    // it provides an easy way to generate universally unique Id values.
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
