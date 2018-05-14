package com.paltechnologies.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.paltechnologies.pal8.Scanner.Scanner;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity
    implements Observer {
    private final String TAG = "MainActivity";

    private Scanner m_scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_scanner = new Scanner(this);
        m_scanner.addObserver(this);
        m_scanner.scan();
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.i(TAG, "update: Something found");
    }
}
