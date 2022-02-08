package baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_2667 {

    public static boolean[] visited;
    public static int[][] arr;
    public static int resultCnt;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수

        arr = new int[n +1][n+1];

        //전체 사각형 입력 받기
        for(int i=1; i<=n; i++){
            String input = sc.next();
            for(int j=1; j<=n; j++){
                arr[i][j] = input.charAt(j)-'0';
            }
        }




        resultCnt = 0;
        visited = new boolean[n + 1]; // 방문 여부를 검사할 배열
        bfs(1);
        System.out.println(resultCnt);



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
