package wowhanBrother_test;//package wowhanBrother_test;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Scanner;
//
//class a11 {
//
//  public static void main(String[] args) {
//		try(Scanner s = new Scanner(System.in))
//		{
//			int n = s.nextInt();
//			int d = s.nextInt();
//			int k = s.nextInt();
//			int j = s.nextInt();
//			
//			//������� �ۼ��� �ּ���
//			int[] arr = new int[n];
//			
//			System.out.println(solve(list, 0, d, k, j));
//		}
//  }
//  public static int solve(int[] arr, int curIdx, int d, int k, int j)
//  {
//	  if(arr.size() == 1)
//		  return arr.get(0);
//	  
//	  int rmIdx = curIdx;
//	  if(d==1) //������
//	  {
//		  
//		  if(arr.size() < rmIdx  + k)
//			  rmIdx = (curIdx+k % arr.size()) - 1;
//		  else
//			  rmIdx = curIdx+k;
//		  
//		  arr.remove(rmIdx);
//		  solve(arr, rmIdx, d, k+j, j);
//				 
//	  }
//	  else//������
//	  {
//		  if(0 > rmIdx -k)
//			  rmIdx = (arr.size() % (curIdx-k +1))  ;
//		  else
//			  rmIdx = curIdx-k;
//		  
//		  arr.remove(rmIdx);
//		  solve(arr, rmIdx, d, k+j, j);
//		  
//	  }
//	  
//	  return 0;
//  }
//  
//}
