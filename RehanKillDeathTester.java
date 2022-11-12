public class RehanKillDeathTester {
    public static void main(String[] args) {
        RehanKillDeath rehan = new RehanKillDeath(10, 20);
        if (rehan.findRank() == "High Iron") {
            System.out.println("findRank()HI - PASS");
        }
        else {
            System.out.println("findRank()HI - FAIL");
        }
 
        rehan.setnumKills(1);      
        rehan.setnumDeaths(2);
 
        if (rehan.findRank() == "Low Iron") {
            System.out.println("findRank()LI - PASS");
        }
        else {
            System.out.println("findRank()LI - FAIL");
        }

        rehan.setnumKills(10);
        rehan.setnumDeaths(14);
 
        if (rehan.findRank() == "High Bronze") {
            System.out.println("findRank()HB - PASS");
        }
        else {
            System.out.println("findRank()HB - FAIL");
        }

        rehan.setnumKills(3);
        rehan.setnumDeaths(4);
 
        if (rehan.findRank() == "Low Bronze") {
            System.out.println("findRank()LB - PASS");
        }
        else {
            System.out.println("findRank()LB - FAIL");
        }
    }
}

