package utility;


import model.SoccerClubLike;
import model.SoccerLeagueLike;
import model.VolleyballClubLike;
import model.VolleyballLeagueLike;

import java.util.List;


public class Printer {
    public static void printSoccerClub(SoccerClubLike club){
        System.out.println("soccer club name: "+ club.getNameClub());
        System.out.println(" club score: "+  club.getScore());
        System.out.println(" club game numbre: "+  club.getGameNumber());
        System.out.println(" club win game: "+  club.getGameWin());
        System.out.println(" club lose game: "+  club.getGameLose());
        System.out.println(" club draw game: "+  club.getGameDraw());

    }
    public static void printVolleyballClub(VolleyballClubLike club) {
        System.out.println("soccer club name: " + club.getNameClub());
        System.out.println(" club score: " + club.getScore());
        System.out.println(" club game numbre: " + club.getGameNumber());
        System.out.println(" club win game: " + club.getGameWin());
        System.out.println(" club lose game: " + club.getGameLose());
        System.out.println(" club Divide points game: " + club.getGameDividepoints());
    }
    public static void printSoccerLeague (SoccerLeagueLike league){
        System.out.println("league name: " + league.getNameOfLeague());
        System.out.println("clubs: ");
        printSoccerClubs(league.getSoccerClubLikes());
    }
    public static void printSoccerClubs(List<SoccerClubLike> clubs){
        for (SoccerClubLike club:clubs) {
            printSoccerClub(club);

        }
    }
    public static void printvollyballLeague(VolleyballLeagueLike league){
        System.out.println("league name: " + league.getNameOfLeague());
        System.out.println("clubs: ");
        printVolleyballClubs(league.getVolleyballClubLikes());
    }
    public static void printVolleyballClubs(List<VolleyballClubLike> clubs){
        for (VolleyballClubLike club:clubs) {
            printVolleyballClub(club);

        }
    }
    public static void printMassage(String Massage){
        System.out.println(Massage);
    }
    public static void printItem(String [] menuItem){
        for (int i = 0; i < menuItem.length; i++) {
            System.out.printf("%d) %s\n",(i+1),menuItem[i]);

        }
    }
}
