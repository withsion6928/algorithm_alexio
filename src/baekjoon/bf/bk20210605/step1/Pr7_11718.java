package baekjoon.bf.bk20210605.step1;

import java.util.Scanner;

public class Pr7_11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1; 
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			if(i == 10) break;
		}
	}
}
