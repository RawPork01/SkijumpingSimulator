import java.util.Arrays;

public class Competition {
    private Jumper[] jumpers;
    private SkiJump skiJump;

    //Methods
    public void start(){
        for (Jumper jumper : jumpers) {
            jumper.setScore((int)jumper.jumps(skiJump));
        }

        Arrays.sort(jumpers, new SortByScore());

        System.out.println("Results in " + skiJump.getPlace());
        System.out.println("-----------------------------------------");
        System.out.printf("%5s %20s %10s", "Place", "Name", "Score");
        System.out.println();
        System.out.println("-----------------------------------------");
        int place = 1;
        for (Jumper jumper : jumpers){
            String placeString = place + ".";
            String scoreString;
            if (jumper.getScore() == 0){
                scoreString = "Crashed";
            }
            else{
                scoreString = jumper.getScore() + "m";
            }

            System.out.format("%5s %20s %10s",
                    placeString, jumper.getName(), scoreString);
            System.out.println();
            place++;
        }
        System.out.println("-----------------------------------------");

    }

    //Constructor
    public Competition(Jumper[] jumpers, SkiJump skiJump){
        setJumpers(jumpers);
        setSkiJump(skiJump);
    }

    //Getters and Setters
    public Jumper[] getJumpers() {
        return jumpers;
    }

    public void setJumpers(Jumper[] jumpers) {
        this.jumpers = jumpers;
    }

    public SkiJump getSkiJump() {
        return skiJump;
    }

    public void setSkiJump(SkiJump skiJump) {
        this.skiJump = skiJump;
    }
}
