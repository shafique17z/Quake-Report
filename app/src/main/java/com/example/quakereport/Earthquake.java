package com.example.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String city, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mCity = city;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
