package com.drakenelson.criminalintentnotes;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by user on 4/12/2017.
 */

public class DatePickerFragment extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //make the view come from dialog_date.xml
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_date, null);

        return new AlertDialog.Builder(getActivity())
                .setView(v) //set the view to the one we created
                .setTitle(R.string.date_Picker_Title) //set the title of the view
                .setPositiveButton(android.R.string.ok, null) //set the text of the positive button
                .create(); //pop it up
    }


}
