// a naive interpretation of twosum (n^2 time complexity)

public class Solution {
  public static void main(String[] args) {
    // parameters
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

    pw.println("Couldn't find two sum");
    // remember this!
    pw.close();
  }
}
