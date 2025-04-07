package repository;

import model.SoccerClubLike;

import java.util.List;

public interface SoccerClubRepository {
    void addClub(String name);
    void removeClub(SoccerClubLike club);
    SoccerClubLike searchClub(String name);
    void informationClub(SoccerClubLike club);
    List<SoccerClubLike> getAllClub();

    void winScoreClub(SoccerClubLike club);
    void loseScoreClub(SoccerClubLike club);
    void Draw(SoccerClubLike club);

}
