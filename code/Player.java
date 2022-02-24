import java.util.ArrayList;
import java.util.List;

/* 
* Build a player for a leader board
*/

public class Player {
    public String username;
    public int score;
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
       int score,
       int index) 
       {
    this.username = username;
    this.score = score;
    this.index = index;
       }
       
       /* gets the score of each player 
       */
       
     public int getScore() {
         return this.score;
     }
   

}
