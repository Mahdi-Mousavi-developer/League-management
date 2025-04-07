package utility;

import repository.repositoryImpl.SoccerClubRepositoryImpl;
import repository.repositoryImpl.SoccerLeagueRepositoryImpl;
import repository.repositoryImpl.VolleyballClubRepositoryImpl;
import repository.repositoryImpl.VolleyballLeagueRepositoryImpl;
import repository.SoccerClubRepository;
import repository.SoccerLeagueRepository;
import repository.VolleyballClubRepository;
import repository.VolleyballLeagueRepository;
import servis.ServisImpl.SoccerClubServisImpl;
import servis.ServisImpl.SoccerLeagueServisImpl;
import servis.ServisImpl.VolleyballClubServisImpl;
import servis.ServisImpl.VolleyballLeagueServisImpl;
import servis.SoccerClubServis;
import servis.SoccerLeagueServis;
import servis.VolleyballClubServis;
import servis.VolleyballLeagueServis;

public class ApplicationContext {
    public static final String[]
    Start_Menu_Item={"add new league","delete league","edit league(add match and club)","print leagues"};

    public static final String[]
    League_Type={"soccer league","volleyball league"};

    public static final String[]
    Edit_League={"create club","add club to league","remove club from league","delete club", "edit club (add match)", "print club","back"};


    public static final String[]
    Add_Soccer_Match={"draw","win/lose"};


    public static final String[]
    Add_Volleyball_Match={"divided point","full score win"};







    private static SoccerClubRepository soccerClubRepositor;
    private static SoccerLeagueRepository soccerLeagueRepository;
    private static VolleyballClubRepository volleyballClubRepository;
    private static VolleyballLeagueRepository volleyballLeagueRepository;

    private static SoccerClubServis soccerClubServis;
    private static SoccerLeagueServis soccerLeagueServis;
    private static VolleyballClubServis volleyballClubServis;
    private static VolleyballLeagueServis volleyballLeagueServis;




    static {
        soccerClubRepositor = new SoccerClubRepositoryImpl();
        soccerLeagueRepository = new SoccerLeagueRepositoryImpl();
        volleyballClubRepository = new VolleyballClubRepositoryImpl();
        volleyballLeagueRepository = new VolleyballLeagueRepositoryImpl();

        soccerLeagueServis = new SoccerLeagueServisImpl(soccerLeagueRepository);
        soccerClubServis = new SoccerClubServisImpl(soccerClubRepositor,soccerLeagueServis );
        ((SoccerLeagueServisImpl)soccerLeagueServis).setSoccerClubServis(soccerClubServis);
        volleyballLeagueServis = new VolleyballLeagueServisImpl(volleyballLeagueRepository);
        volleyballClubServis = new VolleyballClubServisImpl(volleyballClubRepository,volleyballLeagueServis);
        ((VolleyballLeagueServisImpl)volleyballLeagueServis).setVolleyballClubServis(volleyballClubServis);
    }

    public static SoccerClubServis getSoccerClubServis() {
        return soccerClubServis;
    }

    public static SoccerLeagueServis getSoccerLeagueServis() {
        return soccerLeagueServis;
    }

    public static VolleyballClubServis getVolleyballClubServis() {
        return volleyballClubServis;
    }

    public static VolleyballLeagueServis getVolleyballLeagueServis() {
        return volleyballLeagueServis;
    }
}
