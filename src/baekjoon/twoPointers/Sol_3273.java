package baekjoon.twoPointers;

import java.util.Arrays;
import java.util.Scanner;


public class Sol_3273 {

    public static int n;
    public static int m;
    public static int arr[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 세로 개수

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        m = sc.nextInt();

        Arrays.sort(arr);

        int point1 = 0 ;
        int point2 = n-1 ;
        int resultCnt = 0;
        while( point1 < point2){
            if(     arr[point1] + arr[point2] == m) {
                resultCnt++;
                point1++;
            }
            else if(arr[point1] + arr[point2] < m){
                point1++;
            }
            else{
                point2--;
            }

        }
        System.out.println(resultCnt);

    }
}


