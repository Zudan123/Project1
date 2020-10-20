package com.example.project1;

import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApplications extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("movie.db")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(configuration);
    }
}