public class RehanKillDeathTester {
    public static void main(String[] args) {
        RehanKillDeath rehan = new RehanKillDeath(10, 20);
        if (rehan.findRank() == "High Iron") {
            System.out.println("findRank() - PASS");
        }
        else {
            System.out.println("findRank() - FAIL");
        }

        rehan.setnumDeaths(2);
        rehan.setnumKills(1);

        if (rehan.findRank() == "Low Iron") {
            System.out.println("findRank() - PASS");
        }
        else {
            System.out.println("findRank() - FAIL");
        }
    }
}