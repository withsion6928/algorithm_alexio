package baekjoon.step4;

import java.util.Scanner;

public class Pr1_9498 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iGrade = sc.nextInt();
		
		if( iGrade >= 90)
			System.out.println("A");
		else if(iGrade >=80)
			System.out.println("B");
		else if(iGrade >=70)
			System.out.println("C");
		else if(iGrade >=60)
			System.out.println("D");
		else
			System.out.println("F");
	}
	
}
