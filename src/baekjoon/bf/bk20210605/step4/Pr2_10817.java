package baekjoon.bf.bk20210605.step4;

import java.util.Scanner;

public class Pr2_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		int tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		System.out.println(arr[1]);

	}

}
