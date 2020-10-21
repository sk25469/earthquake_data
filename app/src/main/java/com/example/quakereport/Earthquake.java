package com.example.quakereport;

public class Earthquake {

    /** to store the location of earthquake */
    private String mEarthquakeLocation;

    /** to store the magnitude */
    private double mEarthquakeMagnitude;

    /** date of the occurrence of earthquake */
    private long mEarthquakeDate;

    /** url of the particular earthquake so we can direct it to the website */
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param earthquakeMagnitude is the magnitude (size) of the earthquake
     * @param earthquakeLocation is the location where the earthquake happened
     * @param earthquakeDate is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double earthquakeMagnitude, String earthquakeLocation,  long earthquakeDate, String url){
        mEarthquakeDate = earthquakeDate;
        mEarthquakeLocation = earthquakeLocation;
        mEarthquakeMagnitude = earthquakeMagnitude;
        mUrl = url;

    }

    /** returns earthquake magnitude */
    public double getEarthquakeMagnitude() {
        return mEarthquakeMagnitude;
    }

    /** returns earthquake date */
    public long getEarthquakeDate() {
        return mEarthquakeDate;
    }

    /** returns earthquake location */
    public String getEarthquakeLocation() {
        return mEarthquakeLocation;
    }

    /** returns the earthquake url */
    public String getEarthquakeUrl(){
        return mUrl;
    }
}
