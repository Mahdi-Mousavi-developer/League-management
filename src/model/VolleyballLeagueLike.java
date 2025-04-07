package model;

import java.util.ArrayList;

public class VolleyballLeagueLike extends League{
    private ArrayList<VolleyballClubLike> VolleyballClubLikes;
    private  int loserScore;
    private  int winnerScore;

    public VolleyballLeagueLike(String nameOfLeague) {
        super(nameOfLeague);
        this.VolleyballClubLikes = new ArrayList<>();
    }
    public void addVolleyballClub(VolleyballClubLike volleyballClubLike){
        VolleyballClubLikes.add(volleyballClubLike);
    }
    public void deleteVolleyballClub(VolleyballClubLike volleyballClubLike){
        VolleyballClubLikes.remove(volleyballClubLike);
    }

    public ArrayList<VolleyballClubLike> getVolleyballClubLikes() {
        return VolleyballClubLikes;
    }

    public int getLoserScore() {
        return loserScore;
    }

    public void setLoserScore(int loserScore) {
        this.loserScore = loserScore;
    }

    public int getWinnerScore() {
        return winnerScore;
    }

    public void setWinnerScore(int winerScore) {
        this.winnerScore = winerScore;
    }
}
