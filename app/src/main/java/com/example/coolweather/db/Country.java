package com.example.coolweather.db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id= id;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(){
        this.countryName=countryName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(){
        this.cityId=cityId;
    }
}
