package baekjoon.step3;

import java.util.Scanner;

public class Pr9_8393 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.nextLine();
		
		int sum = 0 ;
		char[] rr = new char[a];
		rr = b.toCharArray();
		for(int i = 0 ; i < rr.length; i++)
		{
			sum += Integer.parseInt(rr[i] + "");

		}
		System.out.println(sum);
	}
	
}
