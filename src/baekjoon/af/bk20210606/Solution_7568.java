package baekjoon.af.bk20210606;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_7568 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arrW = new int[a];
        int [] arrH = new int[a];
        int [] arrResult = new int[a];
        int i = 0;
        while( i < a ){
            arrW[i] = sc.nextInt();
            arrH[i] = sc.nextInt();

            i++;
        }
        for( int j = 0 ; j < a ; j++){
            int rank = 1;

            for(int k = 0; k < a; k++){

                if (i == k) continue;

                if(arrW[j] < arrW[k] && arrH[j] < arrH[k]){
                     ++rank;
                }

            }
            System.out.print(rank);
            System.out.print(" ");


        }

    }
}
