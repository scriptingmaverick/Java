public class Rectangle {
  public void drawRectangle(int row_count, int col_count){
    for(int i = 0;i < row_count;i++){
      for(int j = 0;j < col_count;j++){
        System.out.print(" *");
      }

      System.out.println();
    }
  }
}
