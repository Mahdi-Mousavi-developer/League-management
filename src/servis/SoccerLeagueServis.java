package servis;

import model.SoccerLeagueLike;

public interface SoccerLeagueServis {
    void createSoccerLeague();
    void removeLeague();
    SoccerLeagueLike searchLeague();
    void printAllLeagues();
    void addClubToLeague();
    void deleteClubFromLeague();





}
