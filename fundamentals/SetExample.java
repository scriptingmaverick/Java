import java.util.HashSet;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
    Set<Integer> nums = new HashSet<>();

    nums.add(2);
    nums.add(3);
    nums.add(2);

    System.out.println(nums);
  }
}