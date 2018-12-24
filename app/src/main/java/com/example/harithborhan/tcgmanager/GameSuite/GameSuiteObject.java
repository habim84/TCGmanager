package com.example.harithborhan.tcgmanager.GameSuite;

public class GameSuiteObject {

    private String gameSuiteName;

    public GameSuiteObject(String gameSuiteName) {
        if (!gameSuiteName.equals("")) {
            this.gameSuiteName = gameSuiteName;
        }
        else {
            this.gameSuiteName = "NULL";
        }
    }

    public String getGameSuiteName() {
        return gameSuiteName;
    }

    public void setGameSuiteName(String gameSuiteName) {
        if (!gameSuiteName.equals("")) {
            this.gameSuiteName = gameSuiteName;
        }
    }
}
