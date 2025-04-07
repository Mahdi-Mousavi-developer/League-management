package repository.repositoryImpl;
import data.Database;
import repository.SoccerClubRepository;
import model.SoccerClubLike;
import utility.Printer;

import java.util.List;

public class SoccerClubRepositoryImpl implements SoccerClubRepository {

    @Override
    public void addClub(String name) {
        SoccerClubLike club = new SoccerClubLike(name);
        Database.soccerClubLikeList.add(club);

    }

    @Override
    public void removeClub(SoccerClubLike club) {
        Database.soccerClubLikeList.remove(club);

    }

    @Override
    public SoccerClubLike searchClub(String name) {
        return Database.soccerClubLikeList.stream().filter(soccerClubLike->soccerClubLike.getNameClub().equals(name)).findFirst().orElse(null);

    }


    @Override
    public void informationClub(SoccerClubLike club) {
        Printer.printSoccerClub(club);

    }



    @Override
    public void winScoreClub(SoccerClubLike club) {

        club.setScore(club.getScore()+3);
        club.setGameNumber(club.getGameNumber()+1);
        club.setGameWin(club.getGameWin()+1);
    }

    @Override
    public void loseScoreClub(SoccerClubLike club) {
        club.setGameNumber(club.getGameNumber()+1);
        club.setGameLose(club.getGameLose()+1);
    }

    public void Draw(SoccerClubLike club){
        club.setScore(club.getScore()+1);
        club.setGameNumber(club.getGameNumber()+1);
        club.setGameDraw(club.getGameDraw()+1);
    }

    @Override
    public List<SoccerClubLike> getAllClub() {
        return Database.soccerClubLikeList;
    }
}
