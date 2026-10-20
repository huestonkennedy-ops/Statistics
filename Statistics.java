import java.util.ArrayList;
public class Statistics{
    public Count count = new Count();
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
        return count.count((this.numbers));
    }
    public double average() {
        return (1.0*this.sum())/this.count();
    }
    public double passingCount() {
       return count.count(this.passingNumbers);
    }
    public double passingSum() {
       int sum = 0;
       for(int myInt: this.passingNumbers) {
        sum+= myInt;
       }
       return sum;
    }
    public double passingAverage() {
        return(1.0*this.passingSum())/this.count();
    }
    public double passingPercent() {
        return(this.passingCount()/this.count())*100;
    }
    public String gradeDistribution() {
        String fail = "";
        String fifty = "";
        String sixty = "";
        String seventy = "";
        String eighty = "";
        String ninety = "";
        for(int i: this.numbers) {
            if (i<50) {
                fail += 1;
            }
            else if(i<60) {
                fifty += "*";
            } else if(i<70) {
                sixty+="*";
            } else if(i<80) {
                seventy += "*";
            } else if(i<90) {
                eighty += "*";
            } else {
                ninety += "*";
            }
        }
        return("Failed: " + fail + "\n 50-59: " + fifty + "\n 60-69: " + sixty + "\n 70-79: " + seventy + "\n 80-89" + eighty + "\n 90+: " + ninety);
    }
    public void printNumbers() {
        System.out.println(this.numbers);
    }
}