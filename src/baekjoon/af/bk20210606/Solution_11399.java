package baekjoon.af.bk20210606;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_11399 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while( i < a ){
            list.add(sc.nextInt());

            i++;
        }

        Collections.sort(list);
        int result = 0;

        for( int j = 0 ; j < list.size() ; j++){
            for(int k = 0; k <= j ; k++){
                result += list.get(k);
            }

        }



        System.out.println(result);


    }
}
