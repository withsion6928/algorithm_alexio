package nexon_;

import java.util.ArrayList;

public class a333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numbers[] = {4,1,2,3,4};
		 
		 
		 System.out.println(reductionCost(numbers));
	}
	

    /*
     * Complete the function below.
     */
    static int reductionCost(int[] numbers) {
    	
    	int result = 0 ;
    	
    	int[] tmp = new int[10001];
    	ArrayList<Integer> tmplist = new ArrayList<Integer>();
    	if(tmplist.size() == 0)
    		return result;
 
    	return recusiveSum(numbers, 0); 
    }

    static int recusiveSum(int[] arr, int idx)
    {
    	
    	return Math.min(recusiveSum(arr, idx), recusiveSum(arr, idx+1));
    }


}
