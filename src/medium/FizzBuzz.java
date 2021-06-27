package medium;

/**
 * return "Fizz" for multiple of 3
 * return "Buzz" for multiple of 5
 * return "FizzBuzz" for multiple of 3 and multiple of 5
 * return "" for other
 */
public class FizzBuzz {

  public static void main(String[] args) {
    System.out.println(0 + " " + fizzBuzz(0));
    System.out.println(1 + " " + fizzBuzz(1));
    System.out.println(2 + " " + fizzBuzz(2));
    System.out.println(3 + " " + fizzBuzz(3));
    System.out.println(5 + " " + fizzBuzz(5));
    System.out.println(6 + " " + fizzBuzz(6));
    System.out.println(10 + " " + fizzBuzz(10));
    System.out.println(15 + " " + fizzBuzz(15));
    System.out.println(-1 + " " + fizzBuzz(-1));
    System.out.println(-2 + " " + fizzBuzz(-2));
    System.out.println(-3 + " " + fizzBuzz(-3));
    System.out.println(-5 + " " + fizzBuzz(-5));
    System.out.println(-6 + " " + fizzBuzz(-6));
    System.out.println(-10 + " " + fizzBuzz(-10));
    System.out.println(-15 + " " + fizzBuzz(-15));
  }

  public static String fizzBuzz(Integer i) {
    var result = "";
    if (i % 3 == 0) {
      result += "Fizz";
    }
    if (i % 5 == 0) {
      result += "Buzz";
    }
    if (result.equals("")) {
      result = i.toString();
    }
    return result;
  }
}
