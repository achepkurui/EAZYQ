package com.nashipaechepkurui.eazyq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Welcome extends AppCompatActivity {
    Button Submit;
    CheckBox chB1;
    CheckBox chB2;
    CheckBox chB3;
    CheckBox chB4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        chB1= (CheckBox) findViewById(R.id.chB1);
        chB2= (CheckBox) findViewById(R.id.chB2);
        chB3= (CheckBox) findViewById(R.id.chB3);
        chB4= (CheckBox) findViewById(R.id.chB4);

        Submit.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome.this, Kenyatta.class);
                startActivity(intent);
            }

        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Welcome.this, Moiref.class);
                startActivity(intent);
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Welcome.this, Machakoslvl5.class);
                startActivity(intent);
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Welcome.this, Coastgen.class);
                startActivity(intent);
            }
        });

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chB1:
                if (checked);
                    //
                else
                    //
                    break;

            case R.id.chB2:
                if (checked);
                    //
                else
                    //
                    break;

            case R.id.chB3:
                if (checked);
                    //
                else
                    //
                    break;

            case R.id.chB4:
                if (checked);
                    //
                else
                    //
                    break;

        }
    }

}

