import java.util.Random;

public class Jumper {
    private String name;
    private int age;
    private int speed;
    private int jumpStrength;
    private int timing;
    private int landing;
    private int score;

    //Constructors
    public Jumper(String name, int age, int speed, int jumpStrength, int timing, int landing){
        setName(name);
        setAge(age);
        setSpeed(speed);
        setJumpStrength(jumpStrength);
        setTiming(timing);
        setLanding(landing);
    }

    public Jumper(){}

    //Methods
    public float jumps(SkiJump skiJump){
        Random r = new Random();
        float wind = r.nextFloat()*6-3;
        int speedVariance = r.nextInt(3);
        int jumpStrengthVariance = r.nextInt(3);
        int timingVariance = r.nextInt(3);

        int landingDifficulty;

        float hSize = skiJump.gethSize();
        float kPoint = skiJump.getkPoint();
        float jumpScore, jumpMeter, windMeter, scoreMeter;

        float speed = this.speed - speedVariance;
        float jumpStrength = this.jumpStrength - jumpStrengthVariance;
        float timing = this.timing - timingVariance;
        int landing = this.landing;

        jumpScore = ((speed/20)+(jumpStrength/20))*timing/10;
        //System.out.println("Jump Score: " + jumpScore);

        jumpMeter = (float)(((2*jumpScore)-1)*hSize*0.1);
        //System.out.println("Jump Meter: " + jumpMeter);

        windMeter = wind*((hSize-32)/20);
        //System.out.println("Wind Meter: " + windMeter);

        scoreMeter = kPoint + windMeter + jumpMeter;
        //System.out.println("KPoint: " + kPoint);
        //System.out.println("Score Meter: " + scoreMeter);

        landingDifficulty = (int)Math.round((Math.tanh((((scoreMeter/hSize)/1.3)*5)-3)+1)*5);
        //System.out.println(landingDifficulty);

        if (landingDifficulty <= landing){
            return Math.round(scoreMeter);
        }
        else{
            return 0;
        }
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (1 <= speed && speed <= 10){
            this.speed = speed;
        }
        else{
            throw new IllegalArgumentException("Speed must be between 1 and 10!");
        }
    }

    public int getJumpStrength() {
        return jumpStrength;
    }

    public void setJumpStrength(int jumpStrength) {
        if (1 <= jumpStrength && jumpStrength <= 10){
            this.jumpStrength = jumpStrength;
        }
        else{
            throw new IllegalArgumentException("Jump strength must be between 1 and 10!");
        }
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        if (1 <= timing && timing <= 10){
            this.timing = timing;
        }
        else{
            throw new IllegalArgumentException("Timing must be between 1 and 10!");
        }
    }

    public int getLanding() {
        return landing;
    }

    public void setLanding(int landing) {
        if (1 <= landing && landing <= 10){
            this.landing = landing;
        }
        else{
            throw new IllegalArgumentException("Landing must be between 1 and 10!");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
