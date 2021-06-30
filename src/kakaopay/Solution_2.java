package kakaopay;

import java.util.Arrays;
import java.util.LinkedList;
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

        sum = 0;

        sum+=graph[0][0];
        sum+=graph[0][y-1];

        graph[0][0] = 0;
        graph[0][y-1] = 0;

        for(int i = 0 ; i < x; i ++){
            for( int j = 0 ; j < y ; j++){
                if(dfs(i,j)){
                    sum += graph[i][j];
                    graph[i][j] = 0;//점수는 한명에게만 주어짐
                }
            }
        }

        System.out.println(sum);


    }
    public static boolean dfs(int n , int m){
        if( n < 1  || m <= -1 ||  n+1 >= x || m+1 >= y || 3 >= x || y >= 50 ){
            return false;
        }
        dfs(n-1, m +1);//왼쪽아래
        dfs(n, m+1);//아래
        dfs(n+1, m +1);//오른쪽아래

        return true;
    }

}
