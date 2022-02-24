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
    public ArrayList<Player> sortList(){
        ArrayList<Player> result = new ArrayList<Player>();
        int length = board.size();
        // Sorting using a single loop
        for (int j = 0; j < length - 1; j++) {
 
            // Type Conversion of char to int.
            int d1 = board.get(j).getScore();
            int d2 = board.get(j + 1).getScore();
 
            // Comparing the ascii code.
            if (d1 > d2) {
 
                // Swapping of the characters
                Player temp =  board.get(j);
                Player temp2 =  board.get(j + 1);
                
                result.add(j, temp2);
                result.add(j + 1, temp);
                j = -1;
            }
        }
 
        return result;
    }


    @Override
     public List<Player> topN (int n){
        Collections.sort(board, (p1, p2) -> Integer.compare(p1.getScore(), p2.getScore()));
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
