package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Sol_10773 {
    public static Stack<Integer> stack;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수

        stack = new Stack<>();
        for(int i = 0 ; i < n; i++){
            int val = sc.nextInt();
            if(val == 0){
                stack.pop();
            }
            else {
                stack.push(val);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);



    }








}
