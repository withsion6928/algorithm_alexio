package baekjoon.bruteforce;

import java.util.*;

public class Solution_2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            arr.add(input);
        }
        Collections.sort(arr);

        int sum =0;
        for( int i = 0 ; i < n ; i++){
            sum += arr.get(i);
            if( sum > m){
                break;
            }

        }

        System.out.print(sum);


    }


}
