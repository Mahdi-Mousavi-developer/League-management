package repository.repositoryImpl;

import data.Database;
import model.SoccerLeagueLike;
import repository.SoccerLeagueRepository;

import java.util.List;

public class SoccerLeagueRepositoryImpl implements SoccerLeagueRepository {
    @Override
    public void addLeague(SoccerLeagueLike league) {
        Database.soccerLeagueLikeList.add(league);
    }

    @Override
    public void removeLeague(SoccerLeagueLike league) {
        Database.soccerLeagueLikeList.remove(league);

    }

    @Override
    public SoccerLeagueLike searchLeague(String name) {
        return Database.soccerLeagueLikeList.stream().filter(soccerLeagueLike->soccerLeagueLike.getNameOfLeague().equals(name)).findFirst().orElse(null);


    }

    @Override
    public void updateSoccerLeague(SoccerLeagueLike league) {
        for (int i = 0; i < Database.soccerLeagueLikeList.size(); i++) {
            if(Database.soccerLeagueLikeList.get(i).getNameOfLeague().equals(league.getNameOfLeague()))
                Database.soccerLeagueLikeList.set(i,league);
        }
    }

    @Override
    public List<SoccerLeagueLike> getAllLeagues() {
        return Database.soccerLeagueLikeList;
    }
}
