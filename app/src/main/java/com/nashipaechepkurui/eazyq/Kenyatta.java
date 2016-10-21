package com.nashipaechepkurui.eazyq;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Kenyatta extends AppCompatActivity {
    Button Send;
    CheckBox checkB1;
    CheckBox checkB2;
    CheckBox checkB3;
    CheckBox checkB4;
    CheckBox checkB5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenyatta);
        Send = (Button) findViewById(R.id.btnSend);
        checkB1 = (CheckBox) findViewById(R.id.checkB1);
        checkB2 = (CheckBox) findViewById(R.id.checkB2);
        checkB3 = (CheckBox) findViewById(R.id.checkB3);
        checkB4 = (CheckBox) findViewById(R.id.checkB4);
        checkB5 = (CheckBox) findViewById(R.id.checkB5);
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkB1:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.checkB2:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.checkB3:
                if (checked) ;
                    //
                else
                    //
                    break;
                //
                break;
            case R.id.checkB4:
                if (checked) ;
                    //
                else
                    //
                    break;
            case R.id.checkB5:
                if (checked) ;
                    //
                else
                    //
                    break;

        }
    }

    public void createNotification() {

        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(this);
        nBuilder.setContentTitle("EAZYQ");
        nBuilder.setContentText("You are number 4,please wait 10 minutes");
        nBuilder.setSmallIcon(R.drawable.ic_stat_name);

        Notification notification = nBuilder.build();
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        nm.notify(1, notification);

    }
}


