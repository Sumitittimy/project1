public class RehanKillDeath {
    private int kill;
    private int death;
    
    public RehanKillDeath(int kill, int death) {
        this.kill = kill;
        this.death = death;
    }

    public RehanKillDeath() {
        this.kill = 0;
        this.death = 0;
    }

    public int getnumKills() {
        return kill;
    }

    public int getnumDeaths() {
        return death;
    }

    public void setnumKills(int kill) {
        this.kill = kill;
    }

    public void setnumDeaths(int death) {
        this.death = death;  
    }

    public double getRatio() {
        double ratio = kill / death;
        return ratio;
    }

    public String findRank() {
        if (this.getRatio() <= 0.5) {
            if (this.kill >= 10) {
                return "High Iron";
            }
            else {
                return "Low Iron";
            }
        }

        else if (this.getRatio() > 0.5 && this.getRatio() <= 0.75) {
            if (this.kill >= 10) {
                return "High Bronze";
            }
            else {
                return "Low Bronze";
            }
        }

        else if (this.getRatio() > 0.75 && this.getRatio() <= 1) {
            if (this.kill >= 10) {
                return "High Silver";
            }
            else {
                return "Low Silver";
            }
        }

        else if (this.getRatio() > 1 && this.getRatio() <= 1.5) {
            if (this.kill >= 10) {
                return "High Gold";
            }
            else {
                return "Low Gold";
            }
        }

        else if (this.getRatio() > 1.5 && this.getRatio() <= 2) {
            if (this.kill >= 10) {
                return "High Platinum";
            }
            else {
                return "Low Platinum";
            }
        }

        else if (this.getRatio() > 2 && this.getRatio() <= 2.5) {
            if (this.kill >= 10) {
                return "High Diamond";
            }
            else {
                return "Low Diamond";
            }
        }

        else if (this.getRatio() > 2.5 && this.getRatio() <= 3) {
            if (this.kill >= 10) {
                return "High Ascendant";
            }
            else {
                return "Low Ascendant";
            }
        }

        else if (this.getRatio() > 3 && this.getRatio() <= 3.5) {
            if (this.kill >= 10) {
                return "High Immortal";
            }
            else {
                return "Low Immortal";
            }
        }

        else if (this.getRatio() > 3.5 && this.getRatio() <= 4) {
            if (this.kill >= 10) {
                return "High Radiant";
            }
        }

        return "Low Radiant";
    }

    public boolean equalsTo(RehanKillDeath alt) {

    }

    public String toString() {
    
    }
}