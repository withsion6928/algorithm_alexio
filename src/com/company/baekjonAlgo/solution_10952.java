package com.company.baekjonAlgo;

import java.util.Scanner;

public class solution_10952 {

    public static void Solution(){

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
