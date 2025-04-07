package servis.ServisImpl;


import model.VolleyballClubLike;
import model.VolleyballLeagueLike;
import repository.VolleyballLeagueRepository;
import servis.VolleyballClubServis;
import servis.VolleyballLeagueServis;
import utility.Util;
import utility.Printer;

import java.util.List;

public class VolleyballLeagueServisImpl implements VolleyballLeagueServis {
    private final VolleyballLeagueRepository volleyballLeagueRepository;
    private VolleyballClubServis volleyballClubServis;

    public void setVolleyballClubServis(VolleyballClubServis volleyballClubServis) {
        this.volleyballClubServis = volleyballClubServis;
    }

    public VolleyballLeagueServisImpl(VolleyballLeagueRepository volleyballLeagueRepository) {
        this.volleyballLeagueRepository = volleyballLeagueRepository;
    }

    @Override
    public void createVolleyballLeague() {
        String leagueName = Util.getStringInput("******* Enter name of new league :");
        VolleyballLeagueLike searchLeague = volleyballLeagueRepository.searchLeague(leagueName);
        if (searchLeague == null){
            VolleyballLeagueLike volleyballLeague = new VolleyballLeagueLike(leagueName);
            volleyballLeagueRepository.addLeague(volleyballLeague);
        }else Printer.printMassage("this league is already exist (@_@)");
    }

    @Override
    public void removeLeague() {
        VolleyballLeagueLike volleyballLeagueLike= searchLeague();
        volleyballLeagueRepository.removeLeague(volleyballLeagueLike);
    }

    @Override
    public VolleyballLeagueLike searchLeague() {
        String leagueNameInput = Util.getStringInput("******* Enter the volleyball league name :");
        VolleyballLeagueLike searchLeague = volleyballLeagueRepository.searchLeague(leagueNameInput);
        if (searchLeague ==null){
            System.out.println("This league dose not exist (@_@)");
        }
        return searchLeague;
    }

    @Override
    public void printAllLeagues() {
        List<VolleyballLeagueLike> allLeagues = volleyballLeagueRepository.getAllLeagues();
        if(!allLeagues.isEmpty()){
            allLeagues.forEach(Printer::printvollyballLeague);
        }
        else Printer.printMassage("there is not any volleyball League (@_@)");


    }

    @Override
    public void addClubToLeague() {
        String leagueName = Util.getStringInput("******* enter name of league :");
        VolleyballLeagueLike leagueFound = volleyballLeagueRepository.searchLeague(leagueName);
        if(leagueFound!=null){
            String clubName = Util.getStringInput("******* Enter club name :");
            VolleyballClubLike searchClub = volleyballClubServis.searchByName(clubName);
            if (searchClub!=null){
                leagueFound.addVolleyballClub(searchClub);
                volleyballLeagueRepository.updateVolleyballLeague(leagueFound);
            } else if (searchClub==null) {
                Printer.printMassage("club not found. please creat club ane then add club to league (@_@) ");

            }
        }else if(leagueFound==null){
            Printer.printMassage("league not found (@_@)");
        }

    }

    @Override
    public void deleteClubFromLeague() {
        String leagueName = Util.getStringInput("******* enter name of league :");
        VolleyballLeagueLike leagueFound = volleyballLeagueRepository.searchLeague(leagueName);
        if (leagueFound != null) {
            String clubName = Util.getStringInput("******* Enter club name :");
            VolleyballClubLike searchClub = volleyballClubServis.searchByName(clubName);
            if (searchClub != null) {
                leagueFound.deleteVolleyballClub(searchClub);
                leagueFound.getVolleyballClubLikes().remove(searchClub);
                volleyballLeagueRepository.updateVolleyballLeague(leagueFound);
            } else if (searchClub == null) {
                Printer.printMassage("club not found.(@_@)");

            }
        } else if (leagueFound == null) {
            Printer.printMassage("league not found (@_@)");
        }


    }
}
