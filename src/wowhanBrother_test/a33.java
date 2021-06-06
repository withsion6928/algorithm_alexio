package wowhanBrother_test;

import java.util.Scanner;

class a33 {
/**
 * 
 * @param args
 * 
700 400 1600 1100 0 400 1100 900 900 0 1800 650
 */
  public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			int x4 = s.nextInt();
			int y4 = s.nextInt();
			int x5 = s.nextInt();
			int y5 = s.nextInt();
			int x6 = s.nextInt();
			int y6 = s.nextInt();
			
			//여기부터 작성해 주세요
			int arr[][] = new int[10001][10001];
			
			init(arr, x1, y1, x2, y2, 1);
			init(arr, x3, y3, x4, y4, 2);
			init(arr, x5, y5, x6, y6, 3);
			
			int result = 0;
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0 ; j < arr[i].length; j++)
				{
					if(arr[i][j] == -2)
						result++;
					else
						continue;
				}
			}
			System.out.println(result);
			
		}
  }
  
  public static int[][] init(int arr[][], int x1, int y1, int x2, int y2, int gubun)
  {
	  
	  for(int i = x1; i < x2; i++ )
	  {
		  for(int j = y1; j < y2; j++ )
		  {
			  if(gubun != 1)
				  arr[i][j]++;
			  else
				  arr[i][j] = -2;
		  }
	  }
	  
	  return arr;
  }
}
