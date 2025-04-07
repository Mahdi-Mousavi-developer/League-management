package model;

public class VolleyballClubLike extends Club {
    private int gameDividePoints;

    public VolleyballClubLike(String nameClub) {
        super(nameClub);
        this.score=0;
        this.gameNumber=0;
        this.gameWin=0;
        this.gameLose=0;
        this.gameDividePoints=0;


    }

    public int getGameDividepoints() {
        return gameDividePoints;
    }

    public void setGameDividepoints(int gameDividepoints) {
        this.gameDividePoints = gameDividepoints;
    }
}
