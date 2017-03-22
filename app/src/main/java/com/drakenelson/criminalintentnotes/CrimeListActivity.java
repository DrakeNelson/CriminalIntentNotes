package com.drakenelson.criminalintentnotes;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Created by user on 3/20/2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
