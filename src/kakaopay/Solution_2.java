package kakaopay;

import java.util.Scanner;
import java.util.Stack;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.next();//3[a4[c]]  3[a]z
        String tmpInput = inputStr;

        Stack<Integer> stack = new Stack<Integer>();

        int i = 0;
        while(tmpInput.indexOf("[") != -1){ //[]가 없을 떄 까지 루프 수행
            if(tmpInput.charAt(i) == '['){
                stack.push(i);
            }
            else if(tmpInput.charAt(i) == ']'){
                int stkPeek = stack.pop();//open 괄호 pop
                int repeatCnt = Integer.parseInt(tmpInput.substring(stkPeek-1, stkPeek));//반복횟수
                String convertStr = tmpInput.substring(stkPeek+1,i).repeat(repeatCnt);//반복횟수만큼 문자열 반복
                tmpInput = tmpInput.replace(tmpInput.substring(stkPeek-1, i+1), convertStr);//기존->반복처리문자열 replace
            }

            i++;
        }
        System.out.println(tmpInput);
    }


}
