package contest.woburn;

import java.util.*;
import java.io.*;

public class Woburn_Challenge_2015_1 {

	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		//br = new BufferedReader(new FileReader("in.txt"));
		//out = new PrintWriter(new FileWriter("out.txt"));

		int n = readInt();
		Assignment[] a = new Assignment[n];
		for (int i = 0; i < n; i++)
			a[i] = new Assignment(readInt(), readInt());
		Arrays.sort(a);
		int currTime = 0;
		int res = 0;
		for (int i = 0; i < n; i++) {
			currTime += a[i].time;
			if (currTime > a[i].due) {
				res += currTime - a[i].due;
				currTime = a[i].due;
			} 
		}
		out.println(res);
		
		out.close();
	}
	static class Assignment implements Comparable<Assignment> {
		int due, time;
		Assignment (int due, int time) {
			this.due = due;
			this.time = time;
		}
		@Override
		public int compareTo (Assignment a) {
			return due - a.due;
		}
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong () throws IOException {
		return Long.parseLong(next());
	}

	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter () throws IOException {
		return next().charAt(0);
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
