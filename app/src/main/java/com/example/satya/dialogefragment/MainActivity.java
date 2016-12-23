package com.example.satya.dialogefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5;
    TextView tv1,tv2;

    public  void catchData(String date)
    {
        tv1.setText("Selected:"+date);
       // tv1.setText("");

    }
    public  void  catchData1(String time)
    {
        tv2.setText("selected:"+time);
        //tv2.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        bt5 = (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomDialog myCustomDialog = new MyCustomDialog() ;
                myCustomDialog.show(getSupportFragmentManager(),null);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTimePicker myTimePicker = new MyTimePicker();
                myTimePicker.show(getSupportFragmentManager(),null);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDailerPicker myDailerPicker = new MyDailerPicker() ;
                myDailerPicker.show(getSupportFragmentManager(),null);
            }
        });
        //show alert dialog
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyProgressDialog myProgressDialog = new MyProgressDialog();
                myProgressDialog.show(getSupportFragmentManager(),null);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment myDialogFragment = new MyDialogFragment();
                myDialogFragment.show(getSupportFragmentManager(),null);
            }
        });

    }
}
