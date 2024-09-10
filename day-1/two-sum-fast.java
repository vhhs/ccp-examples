// fast two sum, industry standard method
// try to figure out the code!

// methodology (O(n)=nlogn)
// 1. sort array (nlogn)
// 2. find two adjacent integers in sorted array to start with (n)
// 3. push lower integer backwards if too high and higher integer forwards if too low (n)
// overall - nlogn performance, most optimized solution

import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    var nums = new ArrayList<Integer>();
    int target;

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    StringTokenizer st = new StringTokenizer(r.readLine());
    while (st.hasMoreTokens()) {
      nums.add(Integer.parseInt(st.nextToken()));
    }
    target = Integer.parseInt(r.readLine());
    Collections.sort(nums);

    int idxH = 0;
    while (nums.get(idxH) < (target+1) / 2) {
      idxH += 1;
    }
    int idxL = idxH - 1;
    // according to problem definition a two sum will always be available so just using a while true here to find a guaranteed match
    while (true) {
      int sum = nums.get(idxL) + nums.get(idxH);
      if (sum > target) {
        idxL -= 1;
      } else if (sum < target) {
        idxH += 1;
      } else {
        pw.println(nums.get(idxL) + " " + nums.get(idxH));
        pw.close();
        return;
      }
    }
  }
}
