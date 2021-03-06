/*
 * Given two strings, find the longest common subsequence
 * 
 * Time complexity: O(N*M) where N is the length of the first string and M is the length of the second string
 * 
 */

package codebook.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LongestCommonSubsequence {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    //br = new BufferedReader(new FileReader("in.txt"));
    //out = new PrintWriter(new FileWriter("out.txt"));

    out.println(getLongestCommonSubsequence(next(), next()));
    out.close();
  }

  static String getLongestCommonSubsequence(String s1, String s2) {
    int[][] dp = new int[s1.length() + 1][s2.length() + 1];
    int startPos = 0, maxLen = 0;
    for (int i = 1; i <= s1.length(); i++)
      for (int j = 1; j <= s2.length(); j++)
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
          if (dp[i][j] > maxLen) {
            maxLen = dp[i][j];
            startPos = i - dp[i][j];
          }
        }

    return s1.substring(startPos, startPos + maxLen);
  }

  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong() throws IOException {
    return Long.parseLong(next());
  }

  static int readInt() throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble() throws IOException {
    return Double.parseDouble(next());
  }

  static char readCharacter() throws IOException {
    return next().charAt(0);
  }

  static String readLine() throws IOException {
    return br.readLine().trim();
  }
}
