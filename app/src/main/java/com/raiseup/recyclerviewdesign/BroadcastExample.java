package com.raiseup.recyclerviewdesign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class BroadcastExample extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Device is in airplane mode!", Toast.LENGTH_LONG).show();


    }
}
