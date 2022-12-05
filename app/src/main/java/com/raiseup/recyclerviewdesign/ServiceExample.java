package com.raiseup.recyclerviewdesign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("service","onBind(Intent intent)");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("service","onCreate()");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("service","onStartCommand(Intent intent, int flags, int startId)");
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("service","onDestroy()");
    }
}
