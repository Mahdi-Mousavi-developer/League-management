package model;

import java.util.Objects;

public class Club {
    protected String nameClub;
    protected int score;
    protected int gameNumber;
    protected int gameWin;
    protected int gameLose;

    public Club(String nameClub) {
        this.nameClub = nameClub;
        this.score=0;
        this.gameNumber=0;
        this.gameWin=0;
        this.gameLose=0;

    }


    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;

    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public void setGameWin(int gameWin) {
        this.gameWin = gameWin;
    }

    public void setGameLose(int gameLose) {
        this.gameLose = gameLose;
    }

    public String getNameClub() {
        return nameClub;
    }

    public int getScore() {
        return score;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public int getGameWin() {
        return gameWin;
    }

    public int getGameLose() {
        return gameLose;
    }


}
