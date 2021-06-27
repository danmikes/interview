package hard;

import java.util.ArrayList;

/**
 * return minimum number of small rice bags required to reach goal
 */
public class Rice {

  public static void main(String[] args) {
    run(2,2,12);//2
    run(2,1,12);//-1
    run(2,1,5);//0
    run(5,3,24);//-1
    run(2,7,18);//-1
    run(2,10,18);//8
  }

  public static void run(Integer big, Integer small, Integer goal) {
    System.out.printf("%2d %2d %2d : %2d\n", big, small, goal, getNumberSmallBags(big, small, goal));
  }

  public static Integer getNumberSmallBags(Integer big, Integer small, Integer goal) {
     if (big * 5 >= goal) {
       if (small >= goal % 5) {
         return goal % 5;
       }
    } else {
       if (small >= goal - big * 5) {
         return goal - big * 5;
       }
    }
     return -1;
  }
}
