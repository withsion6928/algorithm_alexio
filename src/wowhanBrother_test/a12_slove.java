package wowhanBrother_test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author mtJu
 *
 6 1 1 1
 4 0 2 2
 */
class a12_slove {

  public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
			int n = s.nextInt();
			int d = s.nextInt();
			int k = s.nextInt();
			int j = s.nextInt();
			
			//������� �ۼ��� �ּ���
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++)
				list.add(i+1);
			
			System.out.println(solve(list, 0, d, k, j));
		}
  }
  public static int solve(List<Integer> arr, int curIdx, int d, int k, int j)
  {
	  int maxSize = arr.size();
	  if(maxSize == 1)
		  return arr.get(0);
	  
	  int rmIdx;
	  if(d==1) //������
		  rmIdx = (k % (maxSize)) -1 ;
		  
	  else//������
		  rmIdx = maxSize - (k % (maxSize)) - 1;
		  
	  arr.remove(rmIdx);
	  return solve(arr, rmIdx, d, k+=j, j);

  }
  
}
