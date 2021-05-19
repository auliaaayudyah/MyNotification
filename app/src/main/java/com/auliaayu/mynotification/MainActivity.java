package com.auliaayu.mynotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String judul = "Aulia Notification here!";
        String pesan = "KK4A sudah selesai";
        String appName = getApplicationInfo().name;

        Notif notif = new Notif();
        notif.sendNotif(judul, pesan, appName,this);
    }
}