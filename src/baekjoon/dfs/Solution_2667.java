package baekjoon.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2667 {

    public static int[][] map;
    public static int resultCnt;
    public static int[] pointX = {0, 0,  1 , -1 };
    public static int[] pointY = {1, -1 , 0 ,0 };
    private static boolean[][] visited = new boolean[25][25]; //방문여부
    private static final int[] aparts = new int[25*25];
    public static int n ;
    public static  int apartNum = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 정점의 개수

        map = new int[n ][n];
        visited = new boolean[n][n];

        //전체 사각형 입력 받기
        for(int i=0; i< n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }

//
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && !visited[i][j] ) {
                    apartNum++;
                    dfs(i, j);
                }
            }
        }


        Arrays.sort(aparts);
        System.out.println(apartNum);

        for( int i : aparts){
            if(i != 0){
                System.out.println(i);
            }
        }

    }
    public static void dfs(int x, int y){


        visited[x][y] = true;
        aparts[apartNum]++;

        for ( int i  = 0 ;i  < 4; i++){
            int nx = pointX[i] + x;
            int ny = pointY[i] + y;

            if(nx >= 0 && ny >=0 && nx < n && ny < n ){
                if(map[nx][ny] == 1 && !visited[nx][ny])
                    dfs(nx, ny);

            }
        }
    }

}
