package com.example.harithborhan.tcgmanager.GameSuite;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harithborhan.tcgmanager.R;

import java.util.List;

public class GameSuiteRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String TAG = "GameSuiteRecyclerAdapter";

    private List<GameSuiteObject> gameSuites;

    private GameSuiteClickListener clickListener;

    public GameSuiteRecyclerAdapter(List<GameSuiteObject> gameSuites) {
        this.gameSuites = gameSuites;
    }

    public void setOnClickListener(GameSuiteClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public class GameSuiteHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView gameSuiteName;

        public GameSuiteHolder(View view) {
            super(view);
            gameSuiteName = view.findViewById(R.id.row_game_suite_name);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) {
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }

    @Override
    public GameSuiteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_game_suite, parent, false);
        return new GameSuiteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        GameSuiteObject gameSuite = this.gameSuites.get(position);
        String mGameSuiteName = gameSuite.getGameSuiteName();
        GameSuiteHolder cHolder = (GameSuiteHolder) holder;
        cHolder.gameSuiteName.setText(mGameSuiteName);
    }

    @Override
    public int getItemCount() { return this.gameSuites.size(); }
}
