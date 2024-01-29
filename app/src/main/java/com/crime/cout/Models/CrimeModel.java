package com.crime.cout.Models;

public class CrimeModel {
   String crimeName;
   String crimeType;
   String zipCode;
   String latitude;
   String longitude;

   //CAN DELETE DEFAULT CONST
    public CrimeModel() {
    }

    public CrimeModel(String crimeName, String crimeType, String zipCode, String latitude, String longitude) {
        this.crimeName = crimeName;
        this.crimeType = crimeType;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCrimeName() {
        return crimeName;
    }

    public void setCrimeName(String crimeName) {
        this.crimeName = crimeName;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
