package com.example.coolweather.db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private  String cityName;
    private int cityCode;
    private int provincedId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(){
        this.cityCode=cityCode;
    }
    public int getProvincedId(){
        return provincedId;
    }
    public void setProvincedId(){
        this.provincedId=provincedId;
    }
}
