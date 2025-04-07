package servis;

import model.SoccerClubLike;

public interface SoccerClubServis {
    void addClub();
    void removeClub();
    SoccerClubLike searchClub();
    SoccerClubLike searchByName(String Name);
    void informationClub();
    void scoreBoardClub();
    void winScoreClub();
    void loseScoreClub();
    void Draw();
    void printAllSoccerClub();


}
