import java.util.ArrayList;
public class Statistics{
    private ArrayList<Integer> numbers;
    public Statistics(){
        ArrayList<Integer> temp = new ArrayList<>();
        this(temp);
    }
    public Statistics(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}