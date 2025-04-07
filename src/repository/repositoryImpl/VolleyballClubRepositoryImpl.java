package repository.repositoryImpl;
import data.Database;

import model.VolleyballClubLike;
import repository.VolleyballClubRepository;
import utility.Printer;

import java.util.List;

public class VolleyballClubRepositoryImpl implements VolleyballClubRepository {
    @Override
    public void addClub(String name) {
        VolleyballClubLike club = new VolleyballClubLike(name);
        Database.volleyballClubLikeList.add(club);

    }

    @Override
    public void removeClub(VolleyballClubLike club) {
        Database.volleyballClubLikeList.remove(club);

    }

    @Override
    public VolleyballClubLike searchClub(String name) {
        return Database.volleyballClubLikeList.stream().filter(volleyballClubLike->volleyballClubLike.getNameClub().equals(name)).findFirst().orElse(null);

    }


    @Override
    public void informationClub(VolleyballClubLike club) {
        Printer.printVolleyballClub(club);

    }

    @Override
    public void winScoreClub(VolleyballClubLike club) {

        club.setScore(club.getScore()+3);
        club.setGameNumber(club.getGameNumber()+1);
        club.setGameWin(club.getGameWin()+1);

    }

    @Override
    public void loseScoreClub(VolleyballClubLike club) {

        club.setGameNumber(club.getGameNumber()+1);
        club.setGameLose(club.getGameLose()+1);

    }
    public void loserGetPoint(VolleyballClubLike club){
        club.setScore(club.getScore()+2);
        club.setGameNumber(club.getGameNumber()+1);
        club.setGameDividepoints(club.getGameDividepoints()+1);
    }
    public void winnerGetPoint (VolleyballClubLike club ){
        club.setScore(club.getScore()+1);
        club.setGameNumber(club.getGameNumber()+1);
        club.setGameDividepoints(club.getGameDividepoints()+1);
    }

    @Override
    public List<VolleyballClubLike> getAllVolleyballClub() {
        return Database.volleyballClubLikeList;
    }
}
