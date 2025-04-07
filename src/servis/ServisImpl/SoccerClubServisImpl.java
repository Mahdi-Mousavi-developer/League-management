package servis.ServisImpl;

import model.SoccerClubLike;
import repository.SoccerClubRepository;
import servis.SoccerClubServis;
import servis.SoccerLeagueServis;
import utility.Util;
import utility.Printer;

import java.util.List;

public class SoccerClubServisImpl implements SoccerClubServis {
    private  final SoccerClubRepository soccerClubRepository;
    private final SoccerLeagueServis soccerLeagueServis;

    public SoccerClubServisImpl(SoccerClubRepository soccerClubRepository,SoccerLeagueServis soccerLeagueServis) {
        this.soccerClubRepository = soccerClubRepository;
        this.soccerLeagueServis=soccerLeagueServis;
    }

    @Override
    public void addClub() {
        String name = Util.getStringInput("******* Enter the new club name :");
        SoccerClubLike searchClub = soccerClubRepository.searchClub(name);
        if(searchClub == null){
            soccerClubRepository.addClub(name);
        } else if (searchClub!=null) {
            System.out.println("this club already exist (@_@)");

        }
    }

    @Override
    public void removeClub() {
        SoccerClubLike club = searchClub();
        soccerClubRepository.removeClub(club);
    }

    @Override
    public SoccerClubLike searchClub() {
        String clubNameInput = Util.getStringInput("******* Enter the club name :");
        SoccerClubLike searchClub = soccerClubRepository.searchClub(clubNameInput);
        if (searchClub ==null){
            System.out.println("This club dose not exist (@_@)");
        }
        return searchClub;
    }

    @Override
    public void informationClub() {
        SoccerClubLike club = searchClub();
        soccerClubRepository.informationClub(club);
    }

    @Override
    public void scoreBoardClub() {

    }


    @Override
    public void winScoreClub() {
        String clubNameInput = Util.getStringInput("******* Enter the winner club name :");
        SoccerClubLike searchClub = soccerClubRepository.searchClub(clubNameInput);
        if (searchClub ==null) {
            System.out.println("This club dose not exist (@_@)");
        }
        soccerClubRepository.winScoreClub(searchClub);
    }

    @Override
    public void loseScoreClub() {
        String clubNameInput = Util.getStringInput("******* Enter the loser club name :");
        SoccerClubLike searchClub = soccerClubRepository.searchClub(clubNameInput);
        if (searchClub ==null) {
            System.out.println("This club dose not exist (@_@)");
        }
        soccerClubRepository.loseScoreClub(searchClub);
    }

    @Override
    public void Draw() {
        String clubNameInput = Util.getStringInput("******* Enter the first club name :");
        SoccerClubLike searchClub = soccerClubRepository.searchClub(clubNameInput);
        if (searchClub ==null) {
            System.out.println("This club dose not exist (@_@)");
        }
        soccerClubRepository.Draw(searchClub);

        String club2NameInput = Util.getStringInput("******* Enter the sec club name :");
        SoccerClubLike searchClub2 = soccerClubRepository.searchClub(club2NameInput);
        if (searchClub ==null) {
            System.out.println("This club dose not exist (@_@)");
        }
        soccerClubRepository.Draw(searchClub2);

    }

    @Override
    public SoccerClubLike searchByName(String Name) {
        SoccerClubLike searchClub = soccerClubRepository.searchClub(Name);
        return searchClub ;
    }

    @Override
    public void printAllSoccerClub() {
        List<SoccerClubLike> allClub = soccerClubRepository.getAllClub();
        if(!allClub.isEmpty()){
            allClub.forEach(Printer::printSoccerClub);
        }
        else Printer.printMassage("Club table is empty (@_@)");
    }
}
