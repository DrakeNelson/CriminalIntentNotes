package com.drakenelson.criminalintentnotes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {


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
    public static final String EXTRA_CRIME_ID = "com.drakenelson.criminalintentnotes.crime_id";


    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

}
