package com.example.kusumasri.groupproject;

/**
 * Created by kusumasri on 4/20/17.
 */

public class Locationgps {

    Double latitude;
    Double longitude;

    public Locationgps()
    {

    }
    public Locationgps(Double lon,Double lat)
    {
        latitude=lat;
        longitude=lon;
    }

    public void setlat(Double lat1)
    {
        latitude=lat1;
    }

    public void setlong(Double long1)
    {
        longitude=long1;
    }
    public Double getlatitude()
    {
        return latitude;
    }
    public Double getLongitude()
    {
        return longitude;
    }

}
