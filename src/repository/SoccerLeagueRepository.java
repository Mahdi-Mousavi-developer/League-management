package repository;

import model.SoccerLeagueLike;

import java.util.List;

public interface SoccerLeagueRepository {
    void addLeague(SoccerLeagueLike league);
    void removeLeague(SoccerLeagueLike league);
    SoccerLeagueLike searchLeague(String name);
    void updateSoccerLeague(SoccerLeagueLike league);
    List<SoccerLeagueLike> getAllLeagues();



}
