package baekjoon.af_20210606_baekjoon;

import java.util.Scanner;

public class Solution_10952 {
//2021-06-06 첫 문제 작성
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a= 0, b = 0 ;
        while(true){

            a = scan.nextInt();
            b = scan.nextInt();
            if(a ==0&& b==0)
                break;

            System.out.println(a+b);

        }


    }
}
