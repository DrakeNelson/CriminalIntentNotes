package com.drakenelson.criminalintentnotes;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Drake on 3/20/2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;


    private List<Crime> mCrimes;

    public static String TAG = "CrimeLab";
    //private List<Crime> crimes;


    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for(int i=0;i<100;i++) {
            Crime crime = new Crime();
            crime.setmTitle("Crime #" + i + " " + (char) (0x2600 + (int) ((Math.random() * 255))));
            Log.d(TAG, crime.getmTitle());
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    public static CrimeLab get(Context context){
        if(sCrimeLab==null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public Crime getCrime(UUID uuid) {
        for (Crime crime : mCrimes) {
            if (crime.getmId().equals(uuid)) {
                return crime;
            }
        }
        return null;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }
}
