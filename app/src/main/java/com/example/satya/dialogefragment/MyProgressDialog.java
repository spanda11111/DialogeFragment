package com.example.satya.dialogefragment;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyProgressDialog extends DialogFragment {
    ProgressDialog progressDialog;


    public MyProgressDialog() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d =null;
        progressDialog = new ProgressDialog(getActivity()) ;
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setTitle("UpLoading");
        progressDialog.setMessage("2 of 10 images uploade");
        //progressDialog.setProgress(20);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);//for horizental
        d= progressDialog;
        return d;
    }

    @Override
    public void onResume() {
        super.onResume();
        progressDialog.setProgress(20);
    }
}
