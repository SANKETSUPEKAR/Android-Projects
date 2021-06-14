package com.computerstudent.madpractical.Practical_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.computerstudent.madpractical.R;

public class broadcastReceiver extends AppCompatActivity {
    MyBroadcastReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);
        receiver=new MyBroadcastReceiver();
        registerReceiver(receiver,new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));

    }

    @Override
    protected void onStop() {
        unregisterReceiver(receiver);
        super.onStop();
    }
}