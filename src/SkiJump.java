public class SkiJump {
    private String name;
    private String place;
    private int kPoint;
    private int hSize;

    //Constructor
    public SkiJump(String name, String place, int kPoint, int hSize){
        setName(name);
        setPlace(place);
        setkPoint(kPoint);
        sethSize(hSize);
    }

    public SkiJump(){}

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public float getkPoint() {
        return kPoint;
    }

    public void setkPoint(int kPoint) {
        if (kPoint < 0) {
            throw new IllegalArgumentException("The K-Point cannot be negative!");
        } else {
            this.kPoint = kPoint;
        }
    }

    public float gethSize() {
        return hSize;
    }

    public void sethSize(int hSize) {
        if (hSize < 0) {
            throw new IllegalArgumentException("The Hill-Size cannot be negative!");
        } else {
            this.hSize = hSize;
        }
    }
}
