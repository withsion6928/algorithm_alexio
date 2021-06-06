package dp;

import java.util.Scanner;

class DP1{
   static int score[] = new int[30];
   static int dp[][] = new int[10001][3];
   public static int go(int N, int L)
   {
      if(N<=0)
         return 0;
      if(dp[N][L]!=0)
         return dp[N][L];

      dp[N][1] = go(N-3, 1) + go(N-1, 1)  + score[N];
      dp[N][2] = go(N-2, 1) + score[N];
      
      System.out.printf("N : %d, dp[N][1] : %d, dp[N][2] : %d\n", N, dp[N][1], dp[N][2]);
      return dp[N][L];
   }
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      for(int i = 0; i<= N ; i++)
      {
         score[i] = sc.nextInt();
      }
      System.out.println(go(N, 2));
   }
}