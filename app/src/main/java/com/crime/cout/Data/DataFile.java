package com.crime.cout.Data;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class DataFile {
    Context context;

    public DataFile(Context context) {
        this.context = context;
    }

    public void setMapType(String mapType){
        SharedPreferences sh=context.getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sh.edit();
        myEdit.putString("mapType",mapType);
        myEdit.apply();

    }
    public String getMapType(){
        SharedPreferences sh=context.getSharedPreferences("data", MODE_PRIVATE);
        if(!sh.contains("mapType")){
            SharedPreferences.Editor myEdit = sh.edit();
            myEdit.putString("mapType","n");
            myEdit.apply();
        }
        return sh.getString("mapType","n");
    }
    public void setRadius(String radius){
        SharedPreferences sh=context.getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sh.edit();
        myEdit.putString("radius",radius);
        myEdit.apply();

    }
    public String getRadius(){
        SharedPreferences sh=context.getSharedPreferences("data", MODE_PRIVATE);
        if(!sh.contains("radius")){
            SharedPreferences.Editor myEdit = sh.edit();
            myEdit.putString("radius","50");
            myEdit.apply();
        }
        return sh.getString("radius","50");
    }
}
