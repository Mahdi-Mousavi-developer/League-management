package ui;

import utility.Util;
import utility.ApplicationContext;
import utility.Printer;

public class Menu {
    public static void startMenu(){

        while (true){
            System.out.println("=========================================================");
            Printer.printItem(ApplicationContext.Start_Menu_Item);
            int choose = Util.getIntInput("**** choose your option :");
            switch (choose){
                case 1 :
                    Printer.printItem(ApplicationContext.League_Type);
                    int choose2 = Util.getIntInput("**** choose between : ");
                    if(choose2==1){
                        ApplicationContext.getSoccerLeagueServis().createSoccerLeague();
                    } else if (choose2==2) {
                        ApplicationContext.getVolleyballLeagueServis().createVolleyballLeague();

                    }break;
                case 2 :
                    Printer.printItem(ApplicationContext.League_Type);
                    int choose3 = Util.getIntInput("**** choose your league type between : ");
                    if(choose3==1){
                        ApplicationContext.getSoccerLeagueServis().removeLeague();
                    } else if (choose3==2) {
                        ApplicationContext.getVolleyballLeagueServis().removeLeague();

                    }break;

                case 3 :
                    editLeague();






                case 4 :
                    ApplicationContext.getVolleyballLeagueServis().printAllLeagues();
                    ApplicationContext.getSoccerLeagueServis().printAllLeagues();
                    break;

            }

        }

    }
        public static void editLeague() {
            boolean flag = true;
            while (flag = true) {
                Printer.printItem(ApplicationContext.League_Type);
                int choose4 = Util.getIntInput("**** please choose: ");
                if (choose4 == 1) {
                    editeSoccerMenu();


                } else if (choose4 == 2) {
                    editVolleyballMenu();

                }

            }
        }
    public static void matchSoccerClub() {
        Printer.printItem(ApplicationContext.Add_Soccer_Match);
        int choose7= Util.getIntInput("**** Enter your choose :");
        if (choose7==1){
            ApplicationContext.getSoccerClubServis().Draw();

        } else if (choose7==2) {
            ApplicationContext.getSoccerClubServis().winScoreClub();
            ApplicationContext.getSoccerClubServis().loseScoreClub();
        }
    }

    public  static void matchVolleyballClub(){
        Printer.printItem(ApplicationContext.Add_Volleyball_Match);
        int choose8= Util.getIntInput("**** Enter your choose : ");
        if (choose8==1){
            ApplicationContext.getVolleyballClubServis().winnerGetPoint();
            ApplicationContext.getVolleyballClubServis().loserGetPoint();

        } else if (choose8==2) {
            ApplicationContext.getVolleyballClubServis().winScoreClub();
            ApplicationContext.getVolleyballClubServis().loseScoreClub();
        }
    }
    public static void editeSoccerMenu(){
        System.out.println("=========================================================");
        Printer.printItem(ApplicationContext.Edit_League);
        int choose5 = Util.getIntInput("**** please choose : ");
        switch (choose5) {

            case 1:
                ApplicationContext.getSoccerClubServis().addClub();
                editeSoccerMenu();


            case 2:
                ApplicationContext.getSoccerLeagueServis().addClubToLeague();
                editeSoccerMenu();


            case 3:
                ApplicationContext.getSoccerLeagueServis().deleteClubFromLeague();
                editeSoccerMenu();


            case 4:
                ApplicationContext.getSoccerClubServis().removeClub();
                editeSoccerMenu();
            case 5:
                matchSoccerClub();
                editeSoccerMenu();

            case 6:
                ApplicationContext.getSoccerClubServis().printAllSoccerClub();
                editeSoccerMenu();

            case 7:
                startMenu();
        }
    }
    public static void editVolleyballMenu(){
        System.out.println("=========================================================");
        Printer.printItem(ApplicationContext.Edit_League);
        int choose6 = Util.getIntInput("**** please choose : ");
        switch (choose6) {

            case 1:
                ApplicationContext.getVolleyballClubServis().addClub();
                editVolleyballMenu();


            case 2:
                ApplicationContext.getVolleyballLeagueServis().addClubToLeague();
                editVolleyballMenu();


            case 3:
                ApplicationContext.getVolleyballLeagueServis().deleteClubFromLeague();
                editVolleyballMenu();


            case 4:
                ApplicationContext.getVolleyballClubServis().removeClub();
                editVolleyballMenu();

            case 5:
                matchVolleyballClub();

            case 6:
                ApplicationContext.getVolleyballClubServis().printAllVolleyballClub();
                editVolleyballMenu();

            case 7:
                startMenu();





        }

    }
}

