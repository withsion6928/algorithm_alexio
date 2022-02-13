package baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Solution_7576 {

    public static int[][] map;
    public static int n;
    public static int m;
    public static int[] pointX = {0, 0, 1, -1};
    public static int[] pointY = {1, -1, 0, 0};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        m = sc.nextInt(); // 가로 개수
        n = sc.nextInt(); // 세로 개수

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(bfs());
    }


    public static int bfs() {

        Queue<Dot> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    que.add(new Dot(i, j));
                }
            }
        }


        while (!que.isEmpty()) {
            Dot d = que.peek();
            que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = d.x + pointX[i];
                int ny = d.y + pointY[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (map[nx][ny] == 0) {
                    que.add(new Dot(nx, ny));
                    map[nx][ny] = map[d.x][d.y] + 1;
                }
            }
        }
        return checkTomato();
    }



    static int checkTomato() {
        int result = 0 ;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
               // System.out.print(map[i][j]);
                if(map[i][j] == 0)
                    return -1;

                result = Math.max(result, map[i][j]);
            }
//            System.out.println("");
        }

        return result-1 ;
    }
}
