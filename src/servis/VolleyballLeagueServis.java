package servis;

import model.VolleyballLeagueLike;

public interface VolleyballLeagueServis {
    void createVolleyballLeague();
    void removeLeague();
    VolleyballLeagueLike searchLeague();
    void printAllLeagues();
    void addClubToLeague();
    void deleteClubFromLeague();
}

