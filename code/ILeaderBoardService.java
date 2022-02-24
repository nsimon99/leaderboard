import java.util.ArrayList;
import java.util.List;

/* This is an interface for the Leader Board service */

public interface ILeaderBoardService {
    
   
    
    /* Returns the top leaders with the highest n scores 
    * @return ArrayList of the top n platers
    */
    
    List<Player> topN(int n);
    
     
      /**
   * converts the players string format.
   *
   * @param list representing lost being converted
   * @return list in string format
   */

   String listToString(List<Player> list);
    
    
    
}
