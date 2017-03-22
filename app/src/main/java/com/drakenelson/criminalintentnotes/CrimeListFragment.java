package com.drakenelson.criminalintentnotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 3/20/2017.
 */

public class CrimeListFragment extends Fragment {
    //here is the recyclerview
    private RecyclerView mCrimeRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);

        mCrimeRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
        mCrimeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return view;
        //this is what is overriddent return super.onCreateView(inflater, container, savedInstanceState);
    }

    private class CrimeHolder extends RecyclerView.ViewHolder{

        //title textView
        public TextView mTitleTextView;

        public CrimeHolder(View itemView){
            super(itemView);
            mTitleTextView = (TextView) itemView;
        }
    }
}
