package repository;
import model.VolleyballClubLike;

import java.util.List;

public interface VolleyballClubRepository {
    void addClub(String name);
    void removeClub(VolleyballClubLike club);
    VolleyballClubLike searchClub(String name);
    void informationClub(VolleyballClubLike club);
    void winScoreClub(VolleyballClubLike club);
    void winnerGetPoint(VolleyballClubLike club);
    void loseScoreClub(VolleyballClubLike club);
    void loserGetPoint(VolleyballClubLike club);
    List<VolleyballClubLike> getAllVolleyballClub();
}
