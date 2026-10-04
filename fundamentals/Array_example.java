public class Array_example {
  public static void main(String[] args) {
    int nums[] = new int[4];
    nums[0] = 10;

    System.out.println("Element at index 0: " + nums[0]);
    System.out.println("Element at index 1: " + nums[1]);

    int nums2[]  = {1,3,4};
    
    for(int i=0; i<nums2.length; i++){
      System.out.println("Element at index " + i + ": " + nums2[i]);
    }

    for(int n : nums){
      System.out.println("Element: " + n);
    }

    // index out of bounds exception
    // nums2[6]  = 6;
    // nums[5] = 10; 


    int multiArr [][] = new int[2][3];

    for(int i=0; i<2; i++){
      for(int j=0; j<3; j++){
        multiArr[i][j] = (int) (Math.random() * 10);
      }
    }


    for(int n[] : multiArr){
      for(int m : n){
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }
}
