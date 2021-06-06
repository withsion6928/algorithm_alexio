package dp;

import java.util.Scanner;

public class s1520 {

	static int M, N;
	static int dp[][] = new int[510][510];
	static int arr[][] = new int[510][510];
	static int CNT;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		CNT = 0;

		for (int i = 0; i < dp.length; i++)
			for (int j = 0; j < dp[i].length; j++)
				dp[i][j] = -1;

		for (int i = 1; i <= M; i++)
			for (int j = 1; j <= N; j++)
				arr[i][j] = sc.nextInt();

		
		
		System.out.println(sovle(1,1));
	}

	public static int sovle(int y, int x) {
		int vect_x[] = { 0, 1, 0, -1, 0 };
		int vect_y[] = { 0, 0, 1, 0, -1 };
		if (y == M && x == N)
			return 1;
		if (dp[y][x] != -1)
			return dp[y][x];
		
		for (int i = 1; i <= 4; i++) {
			int nextY = y + vect_y[i];
			int nextX = x + vect_x[i];
			if (arr[nextY][nextX] < arr[y][x] && nextX > 0 && nextX <= N && nextY > 0 && nextY <= M) {
				dp[y][x] += sovle(nextY, nextX);
			}
		}
		return dp[y][x];

	}
}
