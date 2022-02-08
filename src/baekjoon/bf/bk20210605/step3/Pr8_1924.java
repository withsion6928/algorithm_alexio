package baekjoon.bf.bk20210605.step3;

import java.util.Scanner;

public class Pr8_1924 {
	
	private static String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	private static int[] months = { 31,28,31,30,31,30,31,31,30,31,30,31 };
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int  totalDays = 0;
		for( int i = 1; i < a ; i++)
		{
			totalDays += months[i-1];
		}
		totalDays+= b;
		System.out.println(days[totalDays  % days.length] ); 	
	}
}
