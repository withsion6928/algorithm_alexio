package baekjoon.step4;

import java.util.Scanner;

public class Pr6_1110 {
	public static int CNT = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String input = Integer.toString(a);
		if(a < 10)
			input = "00" + a;
		
		if( recusiveGet(input, input) == null)
			System.out.println(CNT);
	}

	public static String recusiveGet(String input, String curStr) {

		char[] arr = (curStr).toCharArray();
		char preChar = (arr[arr.length-1]);
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Character.getNumericValue((arr[i]));
		}
		char[] tmp = Integer.toString(sum).toCharArray();
		String result = Character.toString(preChar) + tmp[tmp.length -1];
		CNT++;
		if( !input.equals(result))
			return recusiveGet(input, result);
		else 
			return null; 
	}

}
