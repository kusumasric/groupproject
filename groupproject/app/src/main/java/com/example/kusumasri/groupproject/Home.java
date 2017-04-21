package com.example.kusumasri.groupproject;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by kusumasri on 2/5/17.
 */

public class Home extends AppCompatActivity {


    public String name = "", pass = "";
    public Location location=new Location(" ");
    TextView tv_longitude,tv_latitude;

    DataStorage data =new DataStorage(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle extras = getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        if (extras != null) {
            name = extras.getString("name");
            pass = extras.getString("pass");
        }
        tv_longitude=(TextView)findViewById(R.id.tv_longitude);
        tv_latitude=(TextView)findViewById(R.id.tv_latitude);
        String hello = "hello" +" "+ name;
        TextView text = (TextView) findViewById(R.id.hellou);
        text.setText(hello);
        Intent intent=new Intent(this,Locationservice.class);
        registerReceiver(uiUpdated, new IntentFilter("LOCATION_UPDATED"));

        startService(intent);

    }

    private BroadcastReceiver uiUpdated= new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {

            String longitude=""+intent.getExtras().getDouble("longitude");
            String latitude=""+intent.getExtras().getDouble("latitude");
            tv_longitude.setText(longitude);
            tv_latitude.setText(latitude);

        }
    };

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onRestart() {

        super.onRestart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(uiUpdated);

    }




}