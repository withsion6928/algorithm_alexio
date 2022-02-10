package baekjoon.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Dot {
    int x;
    int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Sol_2178 {

    public static int[][] map;
    public static int[] pointX = {0, 0,  1 , -1 };
    public static int[] pointY = {1, -1 , 0 ,0 };
    private static boolean[][] visited = new boolean[25][25]; //방문여부
    public static int n ;
    public static int m ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 정점의 개수
        m = sc.nextInt(); // 정점의 개수

        map = new int[n ][m];
        visited = new boolean[n][m];

        //전체 사각형 입력 받기
        for(int i=0; i< n; i++){
            String input = sc.next();
            for(int j=0; j<m; j++){
                map[i][j] = input.charAt(j)-'0';
                visited[i][j] = false;
            }
        }
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(map[n-1][m-1]);




    }



    public static void bfs(int x, int y){

        Queue<Dot> que = new LinkedList<>();
        que.add(new Dot(x,y));

        while( !que.isEmpty()){
            Dot d = que.peek();
            que.poll();
            for(int i =0; i < 4; i ++){
                int nx = d.x + pointX[i];
                int ny = d.y + pointY[i];

                if( nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }
                if(visited[nx][ny] || map[nx][ny] == 0){
                    continue;
                }
                que.add(new Dot(nx,ny));
                map[nx][ny] = map[d.x][d.y] +1;
                visited[nx][ny] = true;

            }
        }

    }

}
