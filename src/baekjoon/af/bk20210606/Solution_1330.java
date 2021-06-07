package baekjoon.af.bk20210606;

import java.util.Scanner;

public class Solution_1330 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String result  = a < b ? "<" : a > b ? ">" : "==";

		System.out.println(result);
	}


}