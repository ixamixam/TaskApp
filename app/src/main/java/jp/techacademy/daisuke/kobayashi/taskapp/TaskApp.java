package jp.techacademy.daisuke.kobayashi.taskapp;

import android.app.Application;

import io.realm.Realm;


//初期化用
public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}