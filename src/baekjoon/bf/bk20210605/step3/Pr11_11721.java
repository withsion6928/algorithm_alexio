package baekjoon.bf.bk20210605.step3;

import java.util.Scanner;

public class Pr11_11721 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] rr = str.toCharArray();
		int prevIdx = 1;
		for(int i = 0 ; i < rr.length; i++)
		{
			System.out.print(rr[i]);
			if(prevIdx++ % 10 == 0)
				System.out.println("");
		}
	}
	
}
