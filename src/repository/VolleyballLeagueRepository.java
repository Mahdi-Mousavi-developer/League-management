package repository;
import model.VolleyballLeagueLike;

import java.util.List;

public interface VolleyballLeagueRepository {
    void addLeague(VolleyballLeagueLike league);
    void removeLeague(VolleyballLeagueLike league);
    VolleyballLeagueLike searchLeague(String name);
    void updateVolleyballLeague (VolleyballLeagueLike league);
    List<VolleyballLeagueLike> getAllLeagues();
}
