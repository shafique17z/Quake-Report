package com.example.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude, String city, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mCity = city;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
