package com.example.harithborhan.tcgmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.harithborhan.tcgmanager.GameSuite.GameSuiteObject;

import java.util.ArrayList;
import java.util.List;

public class TCGHome extends AppCompatActivity {

    private final static String TAG = "TCGHome";

    private List<GameSuiteObject> gameSuiteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcghome);

        // Setup toolbar
        Toolbar homeToolbar = findViewById(R.id.tcg_home_toolbar);
        setSupportActionBar(homeToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(false);
        }

        // Setup Recycler Adapter for the list of Game Suites

    }
}
