package com.nashipaechepkurui.eazyq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Coastgen extends AppCompatActivity {
    Button Send;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coastgen);
        Send= (Button)findViewById(R.id.btnSend);
        cb1= (CheckBox) findViewById(R.id.cb1);
        cb2= (CheckBox) findViewById(R.id.cb2);
        cb3= (CheckBox) findViewById(R.id.cb3);
        cb4= (CheckBox) findViewById(R.id.cb4);
        cb5= (CheckBox) findViewById(R.id.cb5);
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.cb1:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.cb2:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.cb3:
                if (checked) ;
                    //
                else
                    //
                    break;
                //
                break;
            case R.id.cb4:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.cb5:
                if (checked) ;
                    //
                else
                    //
                    break;

        }
    }
}



