public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
    }

    public void setCandyCount(int amount){
        if(amount < 0){
            return;
        }
        candyCount = amount;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost() {
        ghostPresent = false;
    }

    public void haunting(){ghostPresent = true; }

    public void refillCandyBowl(int amount) {
        if(amount < 0){
            return;
        }
        candyCount += amount;
    }

    public void trickOrTreat(int people){
        if(people > candyCount){
            return;
        }
        candyCount = candyCount - people;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    public void runningLow(){
        if(candyCount == 0){
            candyCount = 10;
        }
    }

    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }
}

