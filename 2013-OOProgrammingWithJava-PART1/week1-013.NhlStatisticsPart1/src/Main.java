
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();
        System.out.println("Top 25 by penalty:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();
        System.out.println("Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();
        System.out.println("Statistics for Philadelphia Flyers");
      
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
        
        
        
        
    }
}
