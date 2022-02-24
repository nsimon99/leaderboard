import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        Player p1 = new Player("neha", 100,100);
        Player p2 = new Player("george", 150,110);
        Player p3 = new Player("p3", 150,120);
        Player p4 = new Player("p4", 200,130);
        Player p5 = new Player("p5", 250,140);
        Player p6 = new Player("p6", 300,150);
        Player p7 = new Player("p7", 350,160);
        Player p8 = new Player("p8", 400,170);
        Player p9 = new Player("p9", 450,180);
        Player p10 = new Player("p10", 500,190);
        Player p11 = new Player("p11", 600,200);
        ArrayList<Player> players= new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);
        players.add(p11);
        Leaderboard lb = new Leaderboard(players);

        //System.out.print(lb.listToString(players));
        List<Player> result = new ArrayList<Player>(lb.topN(5));
        System.out.println(lb.listToString(result));
        

    }
}
