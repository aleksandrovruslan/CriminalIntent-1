package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mUUID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private int mRequiresPolice;

    public Crime() {
        mUUID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getUUID() {
        return mUUID;
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

    public int getRequiresPolice() {
        return mRequiresPolice;
    }

    public void setRequiresPolice(int mRequiresPolice) {
        this.mRequiresPolice = mRequiresPolice;
    }

}
