package servis.ServisImpl;


import model.SoccerClubLike;
import model.SoccerLeagueLike;
import repository.SoccerLeagueRepository;
import servis.SoccerClubServis;
import servis.SoccerLeagueServis;
import utility.Util;
import utility.Printer;

import java.util.List;

public class SoccerLeagueServisImpl implements SoccerLeagueServis {
    private final SoccerLeagueRepository soccerLeagueRepository;
    private SoccerClubServis soccerClubServis;

    public  void setSoccerClubServis(SoccerClubServis soccerClubServis) {
        this.soccerClubServis = soccerClubServis;
    }

    public SoccerLeagueServisImpl(SoccerLeagueRepository soccerLeagueRepository) {
        this.soccerLeagueRepository = soccerLeagueRepository;
    }

    @Override
    public void createSoccerLeague() {
        String leagueName = Util.getStringInput("******* Enter name of new league :");
        SoccerLeagueLike searchLeague = soccerLeagueRepository.searchLeague(leagueName);
        if (searchLeague == null){
            SoccerLeagueLike soccerLeague = new SoccerLeagueLike(leagueName);
            soccerLeagueRepository.addLeague(soccerLeague);
        }else Printer.printMassage("this league is already exist (@_@)");

    }

    @Override
    public void removeLeague() {
        SoccerLeagueLike soccerLeagueLike= searchLeague();
        soccerLeagueRepository.removeLeague(soccerLeagueLike);
    }

    @Override
    public SoccerLeagueLike searchLeague() {
        String leagueNameInput = Util.getStringInput("******* Enter the soccer league name :");
        SoccerLeagueLike searchLeague = soccerLeagueRepository.searchLeague(leagueNameInput);
        if (searchLeague ==null){
            System.out.println("This league dose not exist (@_@)");
        }
        return searchLeague;

    }

    @Override
    public void printAllLeagues() {
        List<SoccerLeagueLike> allLeagues = soccerLeagueRepository.getAllLeagues();
        if(!allLeagues.isEmpty()){
            allLeagues.forEach(Printer::printSoccerLeague);
        }
        else Printer.printMassage("there is not any soccer League  (@_@)");


    }

    @Override
    public void addClubToLeague() {
        String leagueName = Util.getStringInput("******* enter name of league :");
        SoccerLeagueLike leagueFound = soccerLeagueRepository.searchLeague(leagueName);
        if(leagueFound!=null){
            String clubName = Util.getStringInput("******* Enter club name :");
            SoccerClubLike searchClub = soccerClubServis.searchByName(clubName);
            if (searchClub!=null){
                leagueFound.addSoccerClub(searchClub);
                soccerLeagueRepository.updateSoccerLeague(leagueFound);
            } else if (searchClub==null) {
                Printer.printMassage("club not found. please creat club ane then add club to league (@_@)");

            }
        }else if(leagueFound==null){
            Printer.printMassage("league not found (@_@)");
        }

    }

    @Override
    public void deleteClubFromLeague() {
        String leagueName = Util.getStringInput("******* enter name of league");
        SoccerLeagueLike leagueFound = soccerLeagueRepository.searchLeague(leagueName);
        if (leagueFound != null) {
            String clubName = Util.getStringInput("******* Enter club name :");
            SoccerClubLike searchClub = soccerClubServis.searchByName(clubName);
            if (searchClub != null) {
                leagueFound.deleteSoccerClub(searchClub);
                soccerLeagueRepository.updateSoccerLeague(leagueFound);
            } else if (searchClub == null) {
                Printer.printMassage("club not found. (@_@)");

            }
        } else if (leagueFound == null) {
            Printer.printMassage("league not found (@_@)");
        }
    }


 }

