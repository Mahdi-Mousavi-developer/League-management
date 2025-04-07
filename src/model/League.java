package model;

import java.util.List;

public class League {
   protected int winScore;
   protected String nameOfLeague;



   public League(String nameOfLeague) {
      this.nameOfLeague = nameOfLeague;
   }

   public void setWinScore(int winScore) {
      this.winScore = winScore;
   }

   public void setNameOfLeague(String nameOfLeague) {
      this.nameOfLeague = nameOfLeague;
   }

   public int getWinScore() {
      return winScore;
   }

   public String getNameOfLeague() {
      return nameOfLeague;
   }

}
