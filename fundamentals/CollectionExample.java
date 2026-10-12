import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
      Collection<Integer> nums = new ArrayList();

      nums.add(2);
      nums.add(3);
      nums.add(4);
      nums.add(5);
      nums.add(2);

      for(int num : nums){
        System.out.println(num);
      }
    }
}
