package com.drakenelson.criminalintentnotes;

import java.util.UUID;

/**
 * Created by user on 2/27/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public boolean isSolved() {
        return solved;
    }

    private boolean solved;
    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getmId(){
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

}
