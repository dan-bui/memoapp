package com.example.username.memoapp;

import android.app.Application;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MySchedulerApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);


    }
}
