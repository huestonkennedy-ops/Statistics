import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        /*This reads from the file "Numbers.txt" and assumes everything is an integer, then calls on the scan() method to turn it into an array */
        try(Scanner scanner = new Scanner(Paths.get("Numbers.txt"))){
        ArrayList<Integer> myInts = scan(scanner);
        System.out.println(myInts);
        } catch(Exception e) {
            System.out.println("Invalid file name");
        }
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
}