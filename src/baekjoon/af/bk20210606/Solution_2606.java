package baekjoon.af.bk20210606;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_2606 {

    public static boolean[] visited;
    public static int[][] arr;
    public static int resultCnt;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 연결 갯수

        arr = new int[n +1][n+1];

        for(int i = 1; i <= m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start][end] = 1;
            arr[end][start] = 1;


        }
        resultCnt = 0;
        visited = new boolean[n + 1]; // 방문 여부를 검사할 배열
        dfs(1);
        System.out.println(resultCnt);



    }

    public static void dfs(int idx){

        visited[idx] = true;

        //System.out.print(idx + " ");

        if( idx == arr.length)
            return;

        for ( int i  = 0 ;i  < arr[idx].length; i++){
            if(!visited[i] && arr[idx][i] == 1 ){
                resultCnt++;
                dfs(i);

            }
        }
    }

}
