package com.masashik;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
  /**
   * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
   * answer[i] == "Fizz" if i is divisible by 3.
   * answer[i] == "Buzz" if i is divisible by 5.
   * answer[i] == i if non of the above conditions are true.
   *
   * Ex.1
   *   Input: n = 3
   *   Output: ["1","2","Fizz"]
   *
   * Ex.2
   *   Input: n = 5
   *   Output: ["1","2","Fizz","4","Buzz"]
   *
   * Ex.3
   *   Input: n = 15
   *   Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
   *
   * Constraint n >= 1 && n <= 10000
   *
   */

  public static void main(String[] args) {
    System.out.println(fizzBuzz(0));
    System.out.println(fizzBuzz(1));
    System.out.println(fizzBuzz(3));
    System.out.println(fizzBuzz(5));
    System.out.println(fizzBuzz(10));
    System.out.println(fizzBuzz(30));
    //System.out.println(fizzBuzz(10000));
    //System.out.println(fizzBuzz(10001));
  }

  public static List<String> fizzBuzz(int n) {
    if (n >= 1 && n <= 10000) {
      List<String> result = new ArrayList<String>();
      for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          result.add("FizzBuzz");
        } else if (i % 3 == 0) {
          result.add("Fizz");
        } else if (i % 5 == 0) {
          result.add("Buzz");
        } else {
          //Cannot be divided by 3 or 5.
          result.add(String.valueOf(i));
        }
      }
      return result;
    } else {
      return new ArrayList<String>();
    }
  }
}
