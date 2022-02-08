package baekjoon.bf.bk20210605.step2;

import java.util.Scanner;

public class Pr8_2839 {
	private static int per5 = 5;
	private static int per3 = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inTotal = sc.nextInt();
		int resultNCnt = 0;

		if (inTotal % per5 == 0) {
			resultNCnt = inTotal / per5;
		} else {
			while (inTotal > 0) {
				inTotal -= per3;
				resultNCnt++;
				if (inTotal % per5 == 0)
					break;
			}
			if (inTotal > 0) {
				resultNCnt+= inTotal / per5; 
				inTotal -= (inTotal / per5) * per5;
			}
			if (inTotal != 0)
				resultNCnt = -1;
		}
		System.out.println(resultNCnt);
	}
}
