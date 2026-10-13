import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Integer> students = new HashMap();

    students.put("nighil", 4);
    students.put("haji", 3);
    students.put("kumar", 4);

    System.out.println(students);
  }
}
