package baekjoon.twoPointers;

import java.util.Scanner;

public class Sol_1806 {


    public static int n;
    public static int m;
    public static int arr[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //입력받은 수
        m = sc.nextInt();
        arr = new int[n+1];

        for(int i  = 0 ; i <n; i ++) {
            arr[i] = sc.nextInt();
        }


        int p1 = 0;
        int p2 = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        while(true){
            if(sum >= m){
                sum-= arr[p1++];
                length = Math.min(length, p2-p1 +1 );
            }
            else if(p2 == n)
                break;
            else
                sum += arr[p2++];

        }
        if(length == Integer.MAX_VALUE  ){
            System.out.println(0);
        }
        else{
            System.out.println(length);
        }



    }
}



