package nexon_;

public class a222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numbers[] = {8,1,3,1,4,5,6,3,2};
		 
		 
		 System.out.println(countDuplicates(numbers));
	}
	

    /*
     * Complete the function below.
     */
    static int countDuplicates(int[] numbers) {
    	int result = 0 ; 
    	int[] tmp = new int[1001];
    	
    	for (int i = 0 ; i < numbers.length ; i++)
    	{
    		tmp[numbers[i]] = tmp[numbers[i]] + 1;
    	}
    	
    	for(int i = 0 ; i < 1001; i++)
    	{
    		if(tmp[i] > 1)
    			result++;
    	}
    	
    	return result; 
    	
    }



}
