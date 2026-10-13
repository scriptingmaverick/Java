import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("lakshmi", "charitha", "khasim", "sheik");

    Optional<String> kha_name = names.stream().filter(i -> i.contains("kha")).findFirst();

    System.out.println("Names matches 'kha': " + kha_name.get());

    Optional<String> lax_name = names.stream().filter(i -> i.contains("lax")).findFirst();

    System.out.println("Names matches 'lax': " + lax_name.orElse("lakshmi charitha"));

    String chai_name = names.stream().filter(i -> i.contains("chai")).findFirst().orElse("charithra");

    System.out.println("Names matches 'chai': " + chai_name);
  }
}
