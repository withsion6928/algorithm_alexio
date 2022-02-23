package baekjoon.twoPointers;

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
            while( i * j <= (n) ) {
                arr[i*j-1] = 0;
                j++;
            }
        }



        int p1 = 1;
        int p2 = 1;
        int cnt = 0;
        int sum = 0;
        while( p2 <n){
            if(arr[p2] == 0 ){
                p2++;
                continue;
            }
            sum += arr[p2];
            if( n == sum ) cnt++;
            while(sum >= n ){
                if(arr[p1] == 0 ){
                    p1++;
                    continue;
                }
                sum-=arr[p1++];
                if(n == sum) cnt++;
            }


            p2++;
        }

        System.out.println(cnt);


    }
}



