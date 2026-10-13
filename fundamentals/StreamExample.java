import java.util.Arrays;
import java.util.List;

public class StreamExample {
  public static void main(String[] args) {
   List<Integer> nums = Arrays.asList(2,4,6,7,9);
   
   int result = nums.stream().filter(n -> n%2 == 0).reduce(0, (c,e) -> c+e);

   System.out.println(nums.stream().filter(n -> n%2 == 0).toList() + " sum of nums is: " + result);

   List<Integer> nums1 = Arrays.asList(3,5,2,7,1,7,9);

   long startSeq = System.currentTimeMillis();
   int res1 = nums1.stream().map(i -> {
    try{Thread.sleep(10);}catch(Exception e){}
    return i * 2;
   }).mapToInt(i -> i).sum();
   long endSeq = System.currentTimeMillis();

   System.out.println("Completion of seq: " + (endSeq - startSeq) + " , sum: " + res1);

   long startPara = System.currentTimeMillis();
   int res2 = nums1.parallelStream().map(i -> {
    try{Thread.sleep(10);}catch(Exception e){}
    return i * 2;
   }).mapToInt(i -> i).sum();
   long endPara = System.currentTimeMillis();

   System.out.println("Completion of seq: " + (endPara - startPara) + " , sum: " + res2);
  }
}
