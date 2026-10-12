import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
    Set<Integer> nums = new HashSet<>();

    nums.add(2);
    nums.add(3);
    nums.add(2);

    Iterator numsIterator =  nums.iterator();
    while(numsIterator.hasNext())
      System.out.println(numsIterator.next());
  }
}