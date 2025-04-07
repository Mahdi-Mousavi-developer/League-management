package servis;

import model.VolleyballClubLike;

public interface VolleyballClubServis {
    void addClub();
    void removeClub();
    VolleyballClubLike searchClub();
    void informationClub();
    void scoreBoardClub();
    void winScoreClub();
    void winnerGetPoint();
    void loseScoreClub();
    void loserGetPoint();
    VolleyballClubLike searchByName(String Name);
    void printAllVolleyballClub();
}
