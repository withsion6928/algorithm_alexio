package baekjoon.bf.bk20210605.step3;

import java.util.Scanner;

public class Pr6_2440 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			for(int i = 1; i <= a ; i++)
			{
				for(int j = a - i; j >= 0; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
