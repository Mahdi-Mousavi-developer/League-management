package model;

import java.util.ArrayList;

public class SoccerLeagueLike extends League{
    private ArrayList<SoccerClubLike> SoccerClubLikes;
    private int DrawScore ;
    public SoccerLeagueLike(String nameOfLeague) {
        super(nameOfLeague);
        this.SoccerClubLikes = new ArrayList<>();

    }

    public int getDrawScore() {
        return DrawScore;
    }

    public void setDrawScore(int drawScore) {
        DrawScore = drawScore;
    }

    public ArrayList<SoccerClubLike> getSoccerClubLikes() {
        return SoccerClubLikes;
    }


    public void addSoccerClub(SoccerClubLike soccerClubLike){
        SoccerClubLikes.add(soccerClubLike);
    }
    public void deleteSoccerClub(SoccerClubLike soccerClubLike){
        SoccerClubLikes.remove(soccerClubLike);
    }
}
