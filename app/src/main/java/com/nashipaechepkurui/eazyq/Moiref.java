package com.nashipaechepkurui.eazyq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Moiref extends AppCompatActivity {
    Button Send;
    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    CheckBox CB4;
    CheckBox CB5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moiref);

        Send= (Button)findViewById(R.id.btnSend);
        CB1= (CheckBox) findViewById(R.id.CB1);
        CB2= (CheckBox) findViewById(R.id.CB2);
        CB3= (CheckBox) findViewById(R.id.CB3);
        CB4= (CheckBox) findViewById(R.id.CB4);
        CB5= (CheckBox) findViewById(R.id.CB5);
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB1:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.CB2:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.CB3:
                if (checked) ;
                    //
                else
                    //
                    break;
                //
                break;
            case R.id.CB4:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.CB5:
                if (checked) ;
                    //
                else
                    //
                    break;

        }
    }
}