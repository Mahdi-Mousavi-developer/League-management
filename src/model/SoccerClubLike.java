package model;

import java.util.Objects;

public class SoccerClubLike extends Club {
    private int gameDraw;

    public SoccerClubLike(String nameClub) {
        super(nameClub);
        this.score = 0;
        this.gameNumber = 0;
        this.gameWin = 0;
        this.gameLose = 0;
        this.gameDraw = 0;


    }

    public void setGameDraw(int gameDraw) {
        this.gameDraw = gameDraw;
    }

    public int getGameDraw() {
        return gameDraw;
    }


}

