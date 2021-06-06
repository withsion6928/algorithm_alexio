package wowhanBrother_test2;

import java.util.*;

class a33 {
/**
 * 
 * @param args
 * 
700 400 1600 1100 0 400 1100 900 900 0 1800 650
 */
  public static void main(String[] args) {
	  
	  System.out.println(solution(2, "1A 2F 1C"));
//	  System.out.println(solution(1, ""));
  }
  
  public static int solution(int N, String S) {
		// write your code in Java SE 83
		int result = 0;
		Set<String> th3Set1 = new HashSet<String>();
		th3Set1.add("A");
		th3Set1.add("B");
		th3Set1.add("C");

		Set<String> th4Set =new HashSet<String>();
		th4Set.add("E");
		th4Set.add("F");
		
		Set<String> th3Set2 = new HashSet<String>();
		th3Set2.add("H");
		th3Set2.add("J");
		th3Set2.add("K");
		
		ArrayList<clazz> list = new ArrayList<>();
		String[] sArray = S.split(" ");

		if (S.length() > 0) {
			for (String idx : sArray) {
				clazz ccc = new clazz();
				ccc.row = Integer.parseInt(idx.substring(0, 1));
				ccc.col = idx.substring(1, 2);
				list.add(ccc);
			}
			Collections.sort(list, new Comparator<clazz>() {
				@Override
				public int compare(clazz o1, clazz o2) {
					// TODO Auto-generated method stub
					if (o1.row > o2.row)
						return -1;
					if (o1.row < o2.row)
						return 1;

					return 0;
				}
			});
		}
	

		int[][] arr1 = new int[3][N];
		for (clazz idxC : list) {
			System.out.println("idxc" + idxC.toString());
			if (th3Set1.contains(idxC.col)) {
				arr1[0][idxC.row-1] = -1;
			}
			else if (th3Set2.contains(idxC.col)) {
				arr1[2][idxC.row-1] = -1;
			}
			else if (th4Set.contains(idxC.col))
			{
				arr1[1][idxC.row-1] = -1;
			}
		}
		for(int i = 0 ; i < arr1.length ; i++)
		{
			for(int j = 0 ; j < arr1[i].length; j++)
			{
				if(arr1[i][j] != -1)
					result++;
			}
		}
	  return result; 
  }
  public static class clazz
  {
	  int row;
	  String col;
	@Override
	public String toString() {
		return "clazz [row=" + row + ", col=" + col + "]";
	} 
  }
}
