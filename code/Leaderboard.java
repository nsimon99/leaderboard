import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 * Builds the top leader board implementing the methods from the {@link ILeaderboardService}.
 */
public class Leaderboard implements ILeaderBoardService {
    public ArrayList<Player> board;
    
    /* constructer for ILeaderboard.
    *
    * @param board  represents the all the players in the game 
    */
    
    public Leaderboard(ArrayList<Player> board) {
        this.board = board;
    }
    
    
   

    @Override
     public List<Player> topN (int n){
        Collections.sort(board,(p1,p2)->{return p2.getScore().compareTo(p1.getScore());});  

         if (n > board.size()) {
          throw new IllegalArgumentException("Requested number bigger than board");
        }
        
         List<Player> leaders = board.subList(0, n);
         return leaders;
     }
     
    
    
  public String listToString(List<Player> list) {
    StringBuilder result = new StringBuilder();
    for (Player p: list) {
      result.append(p.toString()).append((p == list.get(list.size() - 1)) ? "" : ", ");
    }
    return result.toString();
  }
}
