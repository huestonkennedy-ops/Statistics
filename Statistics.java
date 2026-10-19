import java.util.ArrayList;
public class Statistics{
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> passingNumbers;
    public Statistics(ArrayList<Integer> numbers) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> Passing = new ArrayList<>();
        for(int Int: numbers) {
            if (Int<=100 && Int >= 0) {
                temp.add(Int);
            }
            if(Int<=100 && Int>= 50) {
                temp.add(Int);
            }
        }
        this.numbers = temp;
        this.passingNumbers = Passing;
    }
    public int sum() {
        int sum = 0;
        for(int myInt: this.numbers) {
            sum += myInt;
        }
        return sum;
    } 
    public int count() {
        return this.count();
    }
    public double average() {
        return (1.0*this.sum())/this.count();
    }
}