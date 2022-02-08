package baekjoon.bf.bk20210605.step4;

import java.util.Scanner;

public class Pr5_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		double[][] arr = new double[a][2];
		for(int i = 0 ; i < a ; i ++)
		{
			int peCnt = sc.nextInt();
			arr[i][0] = peCnt;
			int[] arrGrade = new int[peCnt];
			int sum = 0;
			for(int j = 0 ; j < peCnt; j ++)
			{
				int val = sc.nextInt();
				sum += val;
				arrGrade[j] = val; 
			}
			int avg = sum / peCnt;
			int upCnt = 0;
			for(int j = 0 ; j < peCnt; j++)
			{
				if( avg < arrGrade[j])
					upCnt++;
			}
			arr[i][1] = (double)upCnt / peCnt * 100;

		}
		for(int i = 0 ; i < arr.length ; i ++)
		{
			System.out.printf("%.3f",arr[i][1]);
			System.out.println("%");
		}

	}

}
