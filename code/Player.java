import java.util.ArrayList;
import java.util.List;

/* 
* Build a player for a leader board
*/

public class Player {
    public String username;
    public Integer score;
    public int index;
    
    /**
   * constructor for player.
   *
   * @param username    represents username of player
   * @param score       represents score player has
   * @param index       represents index of plater
   */
  public Player(
       String username,
       Integer score,
       int index) 
       {
    this.username = username;
    this.score = score;
    this.index = index;
       }
       
       /* gets the score of each player 
       */
       
     public Integer getScore() {
         return this.score;
     }
     
     /* gets the name of each player 
       */
       
     public String getName() {
         return this.username;
     }
     
     /* gets the index of each player 
       */
       
     public int getIndex() {
         return this.index;
     }
     
     /* gets the string 
       */
       
       
     @Override
     public String toString() {
         return this.username + " " + String.valueOf(this.score) + " " + String.valueOf(this.index);
     }
   
   

}
