import java.util.Comparator;

public class SortByScore implements Comparator<Jumper> {
    public int compare(Jumper a, Jumper b){
        return b.getScore() - a.getScore();
    }
}
