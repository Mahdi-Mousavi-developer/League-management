package repository.repositoryImpl;

import data.Database;
import model.VolleyballLeagueLike;
import repository.VolleyballLeagueRepository;

import java.util.List;

public class VolleyballLeagueRepositoryImpl implements VolleyballLeagueRepository {
    @Override
    public void addLeague(VolleyballLeagueLike league) {
        Database.volleyballLeagueLikeList.add(league);
    }

    @Override
    public void removeLeague(VolleyballLeagueLike league) {
        Database.volleyballLeagueLikeList.remove(league);

    }

    @Override
    public VolleyballLeagueLike searchLeague(String name) {
        return Database.volleyballLeagueLikeList.stream().filter(volleyballLeagueLike->volleyballLeagueLike.getNameOfLeague().equals(name)).findFirst().orElse(null);


    }

    @Override
    public void updateVolleyballLeague(VolleyballLeagueLike league) {
        for (int i = 0; i < Database.volleyballLeagueLikeList.size(); i++) {
            if(Database.volleyballLeagueLikeList.get(i).getNameOfLeague().equals(league.getNameOfLeague()))
                Database.volleyballLeagueLikeList.set(i,league);
        }
    }

    @Override
    public List<VolleyballLeagueLike> getAllLeagues() {
        return Database.volleyballLeagueLikeList;
    }
}
