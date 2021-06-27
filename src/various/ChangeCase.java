package various;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Change Case for all strings in list
 */
public class ChangeCase {

  public static void main(String[] args) {
    var changeCase = new ChangeCase();

    List<String> list = new ArrayList<>();
    list.add("hello my friend");
    list.add("how are you today");

    System.out.println(upperCaseStatic(list));
    System.out.println(changeCase.upperCaseInstance(list));
  }

  public static List<String> upperCaseStatic(List<String> list) {
    return list.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());
  }

  public List<String> upperCaseInstance(List<String> list) {
    return list.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());
  }
}
