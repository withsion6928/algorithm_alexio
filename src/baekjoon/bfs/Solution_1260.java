package baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1260 {

    public static boolean[] visited;
    public static int[][] arr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 탐색을 시작할 정점의 번호

        arr = new int[n +1][n+1];

        for(int i = 1; i <= m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start][end] = 1;
            arr[end][start] = 1;
        }

        visited = new boolean[n + 1]; // 방문 여부를 검사할 배열
        dfs(v);
        System.out.println("");
        visited = new boolean[n + 1]; // 방문 여부를 검사할 배열
        bfs(v);


    }

    public static void dfs(int idx){

        visited[idx] = true;

        System.out.print(idx + " ");

        if( idx == arr.length)
            return;

        for ( int i  = 0 ;i  < arr[idx].length; i++){
            if(!visited[i] && arr[idx][i] == 1 ){
                dfs(i);
            }
        }
    }

    public static void bfs(int idx){

        Queue<Integer> que = new LinkedList<>();
        que.add(idx);
        visited[idx] = true;
        System.out.print(idx + " ");

        while( !que.isEmpty()){
            int temp = que.peek();
            que.poll();
            for(int i =0; i < arr.length; i ++){
                if(arr[temp][i] == 1 && !visited[i]){
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }

    }
}
