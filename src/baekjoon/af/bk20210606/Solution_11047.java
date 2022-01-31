package baekjoon.af.bk20210606;

import java.util.Scanner;

public class Solution_11047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;


        int [] c = new int[a];
        int i = 0;
        while( i < a ){
            c[i] = sc.nextInt();

            i++;
        }

        for( int j = a-1 ; j >= 0 ; j--){

//            ?]if( b > c[j]){
                result += b / c[j] ;

                b %= c[j];

//            }
        }
        System.out.print(result);

    }
}
