package baekjoon.bf.bk20210605.step4;

import java.util.Scanner;

public class Pr4_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		double[] arr = new double[a];
		for(int i = 0 ; i < a ; i ++)
			arr[i] = sc.nextInt();
	
		double max = 0;
		
		for(int i = 0 ; i < arr.length; i++)
		{
			if( max < arr[i])
				max = arr[i];
		}
		double sum = 0;
		for(int i = 0 ; i < arr.length; i++)
		{
			sum += (arr[i] = (arr[i] / max) *100  );
		}
		System.out.printf("%.2f",(sum / a)); 

	}

}
