import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    nums.add(25);
    nums.add(67);
    nums.add(34);
    nums.add(9);

    Collections.sort(nums);

    System.out.println(nums);


    List<String> strs = new ArrayList<>();

    strs.add("some");
    strs.add("dog");
    strs.add("elephant");
    strs.add("lion");

    Comparator<String> cmp = (String i, String j) -> {
        if(i.length() < j.length())
          return -1;
        
        return 1;
    };

    Collections.sort(strs, cmp);

    System.out.println(strs);
  }
}
