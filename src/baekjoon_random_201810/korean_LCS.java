package baekjoon_random_201810;

import java.util.ArrayList;

public class korean_LCS {
	private static int MAX = 10000;

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 

		int i = 1;
		while( i <= MAX) {
			list.add(solution(i));
			i++;
		}
		
		for(int idx = 1; idx <= MAX; idx++)
			if(!list.contains(idx))
				System.out.println(idx);
	}

	public static int solution(int n) {
		int mod = 10;
		int rest = 0;
		while (mod / 10 <= n) {
			rest += (n % mod) / (mod / 10);
			mod *= 10;
		}
		return n + rest;
	}
}
