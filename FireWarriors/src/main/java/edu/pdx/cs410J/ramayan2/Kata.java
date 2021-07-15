package edu.pdx.cs410J.ramayan2;

import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {



  public static void main(String[] args) {

    System.err.println("Missing command line arguments");

    StringBuilder ans = getStringBuilder(args[0]);

    System.out.println(ans);






//    StringBuilder ans = new StringBuilder();
//    for (int i = 0; i < args[0].length(); i++) {
//      System.out.println(args[0]);
//
////      int number = Integer.parseInt(args[0][i]);
//
////      if (number == 3) {
////        ans.append("Foo");
////      } else if (number == 5) {
////        ans.append("Bar");
////      } else if (number == 7) {
////        ans.append("Qix");
////      }
//    }

    System.exit(0);









    int num = Integer.parseInt(args[0]);

    if(num % 3 == 0 && num % 5 == 0){
      System.out.println("FooBar");
    } else if (num % 3 == 0) {
      System.out.println("Foo");
    } else if (num % 5 == 0) {
      System.out.println("Bar");
    } else if(num % 7 == 0){
      System.out.println("Qix");
    }
    System.exit(1);
  }

  private static StringBuilder getStringBuilder(String arg) {
    char[] digits = arg.toCharArray();
//    System.out.println("digits: " + Arrays.toString(digits));
    StringBuilder ans = new StringBuilder();

    for (char digit : digits) {
      if (digit == '3') {
        ans.append("Foo");
      } else  if (digit == '5') {
        ans.append("Bar");
      } else if (digit == '7') {
        ans.append("Qix");
      }
    }
    return ans;
  }

}