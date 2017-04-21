package com.example.kusumasri.groupproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.widget.EditText;

/**
 * Created by kusumasri on 4/20/17.
 */

public class LocationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Double latitude=intent.getExtras().getDouble("latitude");
        Double longitude=intent.getExtras().getDouble("longitude");

      //  context.startService(new Intent(context, Locationservice.class));

    }
}
