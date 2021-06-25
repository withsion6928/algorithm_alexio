package kakaopay;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution_2 {
    public static int x ;
    public static int y ;
    public static int [][] graph;
    public static int sum;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        y = scan.nextInt();
        x = scan.nextInt();

        String line = scan.next();
        Scanner scan2 = new Scanner(line).useDelimiter(",");

        graph = new int[x][y];
        for(int i = 0 ; i < x; i ++){
            for( int j = 0 ; j < y ; j++){
                graph[i][j] = scan2.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(graph));

        int result = 0 ;
        for(int i = 0 ; i < x; i ++){
            for( int j = 0 ; j < y ; j++){
                if(dfs(i,j)){
                    result += graph[i][j];
                    graph[i][j] = 0;
                }
            }
        }

        System.out.println("result::;"+result);


    }
    public static boolean dfs(int n , int m){
        if( n < 1  || m <= -1 ||  n+1 >= x || m+1 >= y || 3 >= x || y >= 50 ){
            return false;
        }
        System.out.println("n::"+n);
        System.out.println("m::"+m);
        System.out.println("x::"+x);
        System.out.println("y::"+y);
        System.out.println(":::::::::::::");

        if(graph[n][m] != 0){
            dfs(n-1, m +1);

            dfs(n, m+1);
            dfs(n+1, m +1);
            return true;
        }
        return false;
    }

}
