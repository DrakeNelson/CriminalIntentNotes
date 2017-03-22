package com.drakenelson.criminalintentnotes;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import layout.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity implements CrimeFragment.OnFragmentInteractionListener {


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        //make a fragment manager using a factory method
//        FragmentManager fm = getSupportFragmentManager();
//        //make a fragment (find by id)
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//        //check if null
//        if (fragment == null) {
//            //instantiate the new fragment
//            fragment = new CrimeFragment();
//            //add the fragment
//            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
//        }
//
//    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
