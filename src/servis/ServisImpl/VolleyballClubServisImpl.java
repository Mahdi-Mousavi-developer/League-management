package servis.ServisImpl;

import model.VolleyballClubLike;
import repository.VolleyballClubRepository;
import servis.VolleyballClubServis;
import servis.VolleyballLeagueServis;
import utility.Util;
import utility.Printer;

import java.util.List;

public class VolleyballClubServisImpl implements VolleyballClubServis {
    private final VolleyballClubRepository volleyballClubRepository;
    private final VolleyballLeagueServis volleyballLeagueServis;
    public VolleyballClubServisImpl(VolleyballClubRepository volleyballClubRepository,VolleyballLeagueServis volleyballLeagueServis) {
        this.volleyballClubRepository = volleyballClubRepository;
        this.volleyballLeagueServis = volleyballLeagueServis;
    }

    @Override
    public void addClub() {
        String clubNameInput = Util.getStringInput("******* Enter the club name :");
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            volleyballClubRepository.addClub(clubNameInput);
        } else if (searchClub!= null) {
            System.out.println("this club already exist (@_@)");

        }


    }

    @Override
    public void removeClub() {
        VolleyballClubLike club = searchClub();
        volleyballClubRepository.removeClub(club);


    }

    @Override
    public VolleyballClubLike searchClub() {
        String clubNameInput = Util.getStringInput("******* Enter the club name :");
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            System.out.println("club dose not exist (@_@)");
        }
            return searchClub;

    }

    @Override
    public void informationClub() {
        VolleyballClubLike club = searchClub();
        volleyballClubRepository.informationClub(club);
    }

    @Override
    public void scoreBoardClub() {

    }

    @Override
    public void winScoreClub() {
        String clubNameInput = Util.getStringInput("******* Enter the winner club name :");
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            System.out.println("club dose not exist (@_@)");
        }else if (searchClub!=null) {
            volleyballClubRepository.winScoreClub(searchClub);
        }
    }

    @Override
    public void winnerGetPoint() {
        String clubNameInput = Util.getStringInput("******* Enter the winner club name :");
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            System.out.println("club dose not exist (@_@)");
        }else if (searchClub!=null) {
            volleyballClubRepository.winnerGetPoint(searchClub);
        }
    }

    @Override
    public void loseScoreClub() {
        String clubNameInput = Util.getStringInput("******* Enter the loser club name :");
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            System.out.println("club dose not exist (@_@)");
        } else if (searchClub!=null) {
            volleyballClubRepository.loseScoreClub(searchClub);
        }
    }

    @Override
    public void loserGetPoint() {
        String clubNameInput = Util.getStringInput("******* Enter the loser club name :");
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            System.out.println("club dose not exist (@_@)");
        }else if (searchClub!=null) {
            volleyballClubRepository.loserGetPoint(searchClub);
        }
    }
    @Override
    public VolleyballClubLike searchByName(String Name) {
        VolleyballClubLike searchClub = volleyballClubRepository.searchClub(Name);
        return searchClub ;
    }
    @Override
    public void printAllVolleyballClub() {
        List<VolleyballClubLike> allClub = volleyballClubRepository.getAllVolleyballClub();
        if(!allClub.isEmpty()){
            allClub.forEach(Printer::printVolleyballClub);
        }
        else Printer.printMassage(" Club table is empty (@_@)");
    }
}

