package baekjoon.dfs;

import java.util.Scanner;

public class Solution_1012 {

    public static int[][] map;
    public static int[] pointX = {0, 0,  1 , -1 };
    public static int[] pointY = {1, -1 , 0 ,0 };
    private static boolean[][] visited = new boolean[50][50]; //방문여부
    public static int n ;
    public static int m ;
    public static int k ;
    public static  int bugNum = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int TestCase = 0;

        TestCase = sc.nextInt();//테스트케이스 갯수
        int cnt =0 ; 
        
        
        while(cnt < TestCase){
            bugNum = 0;
            n = sc.nextInt(); // 가로의 개수
            m = sc.nextInt(); // 세로
            k = sc.nextInt();// 배추 갯수

            map = new int[n ][m];
            visited = new boolean[n][m];

            //전체 사각형 입력 받기
            for(int i=0; i< k; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                map[a][b] = 1;
            }



//
            for(int i=0; i< n; i++){
                for(int j=0; j<m; j++){
                    if(map[i][j] == 1 && !visited[i][j] ) {
                        bugNum++;
                        dfs(i, j);
                    }
                }
            }


            System.out.println(bugNum);
            cnt++;
        }
        


    }
    public static void dfs(int x, int y){


        visited[x][y] = true;

        for ( int i  = 0 ;i  < 4; i++){
            int nx = pointX[i] + x;
            int ny = pointY[i] + y;

            if(nx >= 0 && ny >=0 && nx < n && ny < m){
                if(map[nx][ny] == 1 && !visited[nx][ny])
                    dfs(nx, ny);

            }
        }
    }

}
