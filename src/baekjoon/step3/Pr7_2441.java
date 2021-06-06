package baekjoon.step3;

import java.util.Scanner;

public class Pr7_2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= a-i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
