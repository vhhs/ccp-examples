// import scanner class (java.util.Scanner) and other utilities not used in this example
import java.util.*;

// main class, contains main function for starting execution
public class Solution {
  // main function, entry point for program. takes arguments (args) for use in a console application
  public static void main(String[] args) {
    // create a new Scanner object for reading input (constructed with System.in for reading standard input stream)
    var stdin = new Scanner(System.in);
    // get n from std input
    // n is an integer, so declare as int and use nextInt() to read
    int n = stdin.nextInt();
    // run simulation until n is one
    while (n != 1) {
      // when printing each number, add a space in between consecutive outputs
      System.out.print(n + " ");
      // if n divided by 2 has a remainder of zero (% is modulo operator)
      if (n % 2 == 0) {
        // then divide by 2 (x /= y shorthand for x = x / y)
        n /= 2;
      // if n is not divisible by 2
      } else {
        // then multiply by 3 and add 1
        n = n*3 + 1;
      }
    }
    // use println to send an endline and finish output
    System.out.println(n);
    // no return needed as function doesnt return value
  }
}
