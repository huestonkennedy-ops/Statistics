import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        /*This reads from the file "Numbers.txt" and assumes everything is an integer, then calls on the scan() method to turn it into an array */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myInts = readFile("Numbers.txt");
        // this reads from
        Statistics nums = new Statistics(myInts);
        System.out.println(nums.gradeDistribution());
        nums.printNumbers();
    }
    public static ArrayList<Integer> scan(Scanner scanner) {
        /*This method reads from a scanner, wether it be user input or reading from a file, and converts it into an array. */
       ArrayList<Integer> temp = new ArrayList<>();
        while(scanner.hasNextLine()) {
            int tempInt = Integer.valueOf(scanner.nextLine());
            if (tempInt == -1) {
                return(temp);
            } else {
                temp.add(tempInt);
            }
        }
            return(temp);
    }
    // I wanted to avoid putting everything in a try catch loop, so I made a function that reads a file, and if the name is invalid, it just returns 0.
    public static ArrayList<Integer> readFile(String file) {
 try(Scanner scanner = new Scanner(Paths.get(file))){
        ArrayList<Integer> temp = scan(scanner);
        return(temp);
        } catch(Exception e) {
            System.out.println("Invalid file name");
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(0);
            return(temp);
        }
    }
     public int count(ArrayList<Integer> nums) {
        int count = 0;
        for(int i:nums) {
            count += 1;
        }
        return count;
    }
}
