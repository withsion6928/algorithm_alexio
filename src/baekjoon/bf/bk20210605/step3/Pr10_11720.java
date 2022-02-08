package baekjoon.bf.bk20210605.step3;

import java.util.Scanner;

public class Pr10_11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nCnt = sc.nextLine();
		String str = sc.nextLine();
		
		char[] rr = new char[nCnt.length()];
		rr = str.toCharArray();
		int result = 0 ;
		for(int i = 0 ; i < rr.length; i++)
		{
			result += Character.getNumericValue(rr[i]);
			
		}
		System.out.println(result);
	}
	
}
