package com.example.satya.dialogefragment;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDailerPicker extends DialogFragment {

// Dailer picker originally here Date picker, mistakely taken as Dailerpicker
    public MyDailerPicker() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        //for taking original date from internally we use Calender class
        Calendar calendar = Calendar .getInstance();
        int year = calendar .get(Calendar.YEAR);
        int month = calendar .get(Calendar.MONTH);
        int date = calendar .get(Calendar.DATE);
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                //this method iwill be called when user cliks done button
                Toast.makeText(getActivity(), "Selected :"+year+"-"+(month+1)+"-"+dayOfMonth, Toast.LENGTH_SHORT).show();
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity .catchData(year+"/"+(month+1)+"/"+dayOfMonth);
            }
        }, year, month, date);
        d = datePickerDialog ;
        return d;
    }
}
