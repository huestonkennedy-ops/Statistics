 import java.util.ArrayList;
 public class Count{
 public int count(ArrayList<Integer> nums) {
        int count = 0;
        for(int i:nums) {
            count += 1;
        }
        return count;
    }
}