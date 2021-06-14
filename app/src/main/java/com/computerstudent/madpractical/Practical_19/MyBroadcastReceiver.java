package com.computerstudent.madpractical.Practical_19;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if(action != null){
            if(action.equals(Intent.ACTION_BOOT_COMPLETED)){
                Toast.makeText(context,"BOOT COMPLETED",Toast.LENGTH_LONG).show();
            }
            if(Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0)==0)
            {
                Toast.makeText(context, "Airplane mode off",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(context,"Airplane mode on",Toast.LENGTH_LONG).show();
            }
        }
    }

}

