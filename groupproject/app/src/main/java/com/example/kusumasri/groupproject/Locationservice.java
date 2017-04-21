package com.example.kusumasri.groupproject;

import android.Manifest;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.NotificationCompat;
import android.widget.EditText;

/**
 * Created by kusumasri on 4/20/17.
 */

public class Locationservice extends Service {
    public Context context;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        locationasynctask locationtask =new locationasynctask();
        context=getApplicationContext();
        try {
            locationtask.execute(context);
        }
        catch (Exception e)
        {
            System.out.print(e);
        }


        return START_STICKY;

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

    }


}
