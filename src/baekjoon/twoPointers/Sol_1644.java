package baekjoon.twoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class Sol_1644 {


    public static int n;
    public static int arr[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //입력받은 수

        arr = new int[n];
        for(int i  = 1 ; i <= arr.length; i ++) {
            arr[i-1] = i;
        }

        for (int i = 2; i < n; i++) {

            int j = 2;
            while( i * j < (n) ) {
                arr[i*j-1] = 0;
                j++;
            }
        }

        int p1 = 1;
        int p2 = 1;
        int cnt = 0;
        int sum = 0;
        while( p1 < n && p2 <n){
            sum = arr[p1] +arr[p2];


        }



    }
}



