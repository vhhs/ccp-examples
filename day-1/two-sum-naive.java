// a naive interpretation of twosum (n^2 time complexity)

// imports, use util and io for arraylist/stringtokenizer and buffered reader/writer respectively
// good code doesnt do glob imports (*) but competitive code does to speed up time
// as a rule of thumb, when competitive programming just remember these two lines at the top
import java.util.*;
import java.io.*;

public class Solution {
  // add "throws IOException" to allow BufferedReader.readLine() usage (in case of stdin failure/bad input)
  public static void main(String[] args) throws IOException {
    // parameters
    // ArrayList object is an expandable array
    // to hold int, must be made with type parameter Integer in constructor
    var nums = new ArrayList<Integer>();
    int target;
    
    // buffered io (faster), reads stdin and outputs stdout in chunks instead of by character
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    StringTokenizer st = new StringTokenizer(r.readLine());
    while (st.hasMoreTokens()) {
      // add each integer in the line to the nums array
      nums.add(Integer.parseInt(st.nextToken()));
    }
    target = Integer.parseInt(r.readLine());

    // naive interpretation runs in O(n)=n^2
    // goes down the list, for each integer checks all integers later than it in the list
    // if it finds two that add up correctly, prints them and returns
    
    // size() method gets length of ArrayList
    for (int i = 0; i < nums.size() - 1; i += 1) {
	    for (int j = i + 1; j < nums.size(); j += 1) {
        // get(i) method on ArrayList gets element at index i
        // this checks if the two tested numbers add to the target
        if (nums.get(i) + nums.get(j) == target) {
          // implicit conversion int to string for printing
          pw.println(nums.get(i) + " " + nums.get(j));
          // close buffer (see note at bottom) and exit function now that two pair has been found
          pw.close();
          return;
        }
      }
    }

    pw.println("Couldn't find two sum");
    // remember this! always execute before returning from main
    pw.close();
  }
}
