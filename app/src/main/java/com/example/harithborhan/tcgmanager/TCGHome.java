package com.example.harithborhan.tcgmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.harithborhan.tcgmanager.GameSuite.GameSuiteClickListener;
import com.example.harithborhan.tcgmanager.GameSuite.GameSuiteObject;
import com.example.harithborhan.tcgmanager.GameSuite.GameSuiteRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TCGHome extends AppCompatActivity implements GameSuiteClickListener {

    private final static String TAG = "TCGHome";

    private List<GameSuiteObject> gameSuiteList = new ArrayList<>();
    private GameSuiteRecyclerAdapter gameSuiteAdapter;
    private RecyclerView gameSuiteRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcghome);

        // Set UI elements
        gameSuiteRecyclerView = this.findViewById(R.id.recycler_game_suite);

        // Setup toolbar
        Toolbar homeToolbar = findViewById(R.id.tcg_home_toolbar);
        setSupportActionBar(homeToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(false);
        }

        // Setup Recycler Adapter for the list of Game Suites
        gameSuiteAdapter = new GameSuiteRecyclerAdapter(gameSuiteList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        gameSuiteRecyclerView.setLayoutManager(mLayoutManager);
        gameSuiteRecyclerView.setItemAnimator(new DefaultItemAnimator());
        gameSuiteRecyclerView.setAdapter(gameSuiteAdapter);
        gameSuiteAdapter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view, int position) {
        // TODO: Setup on click action on one of the recycler view item.
    }
}
