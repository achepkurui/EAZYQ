package com.nashipaechepkurui.eazyq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Machakoslvl5 extends AppCompatActivity {
    Button Send;
    CheckBox checkb1;
    CheckBox checkb2;
    CheckBox checkb3;
    CheckBox checkb4;
    CheckBox checkb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machakoslvl5);

        Send= (Button)findViewById(R.id.btnSend);
        checkb1= (CheckBox) findViewById(R.id.checkb1);
        checkb2= (CheckBox) findViewById(R.id.checkb2);
        checkb3= (CheckBox) findViewById(R.id.checkb3);
        checkb4= (CheckBox) findViewById(R.id.checkb4);
        checkb5= (CheckBox) findViewById(R.id.checkb5);
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkb1:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.checkb2:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.checkb3:
                if (checked) ;
                    //
                else
                    //
                    break;
                //
                break;
            case R.id.checkb4:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.checkb5:
                if (checked) ;
                    //
                else
                    //
                    break;

        }
    }
}

