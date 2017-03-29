package com.drakenelson.criminalintentnotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by user on 3/20/2017.
 */

public class CrimeListFragment extends Fragment {
    //here is the recyclerview
    private RecyclerView mCrimeRecyclerView;

    private CrimeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);

        mCrimeRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
        mCrimeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
        //this is what is overriddent return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void updateUI() {
        CrimeLab crimeLab = CrimeLab.get(getActivity());

        List<Crime> crimes = crimeLab.getCrimes();

        adapter = new CrimeAdapter(crimes);
        mCrimeRecyclerView.setAdapter(adapter);

    }

    private class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        //title textView
        private TextView mTitleTextView;
        private TextView mDateTextView;
        private CheckBox mSolvedCheckBox;
        private Crime mCrime;

        public CrimeHolder(View itemView) {
            super(itemView);


            mTitleTextView = (TextView) itemView.findViewById(R.id.list_item_crime_title_text_view);
            mDateTextView = (TextView) itemView.findViewById(R.id.list_item_crime_date_text_view);
            mSolvedCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_crime_solved_check_box);

        }

        public void bindCrime(Crime crime) {
            mCrime = crime;
            mTitleTextView.setText(mCrime.getmTitle());
            mDateTextView.setText("fff");
            mSolvedCheckBox.setChecked(mCrime.isSolved());
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(),mCrime.getmTitle()+"clicked",Toast.LENGTH_SHORT);
        }
    }

    /*
    the adapter is the connection between the view and database;
    we use an arraylist in the adapter to hold a list of crimes
    when we create a viewholder it creates a blank list of crimes
    getItemCount figures out how many items there are
    onBindViewHolder puts a specific piece of data in a specific view (plug-in)*/
    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder> {

        //hold list of crimes
        private List<Crime> mCrimeList;


        public CrimeAdapter(List<Crime> crimes) {
            mCrimeList = crimes;
        }

        @Override
        public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_crime, parent, false);
            return new CrimeHolder(view);
        }

        @Override
        public void onBindViewHolder(CrimeHolder holder, int position) {
            Crime crime = mCrimeList.get(position);
            //holder.mTitleTextView.setText(crime.getmTitle());
            holder.bindCrime(crime);

        }

        @Override
        public int getItemCount() {
            return mCrimeList.size();
        }
    }
}
