package wowhanBrother_test2;

import java.util.EmptyStackException;
import java.util.Stack;

class a22 {

	public static void main(String[] args) {
		String a = "13 DUP 4 POP 5 DUP + DUP + -";
//		String a = "3 DUP 5 - -";
//		String a = "5 6 + -";

		System.out.println(solution(a));

	}

	public static int solution(String S) {
		// write your code in Java SE 8
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		try {

			for (int i = 0; i < S.length(); i++) {
				char cur = S.charAt(i);

				if (cur == ' ') {
					solve(stack, sb.toString());
					sb.setLength(0);
				} else if (i == S.length() - 1) {
					sb.append(S.charAt(i));
					solve(stack, sb.toString());
					sb.setLength(0);
				} else
					sb.append(S.charAt(i));
			}
		} catch (EmptyStackException e) {
			return -1;
		}
		for (Integer a : stack) {
			System.out.println(a);
		}

		return stack.size() > 0 ? stack.pop() : -1;
	}
	
	public static void solve(Stack<Integer> stack, String oper) throws EmptyStackException
	{
			
		if(isInt(oper))
			stack.push(Integer.parseInt(oper));
		else if("DUP".equals(oper))
		{
			stack.push(stack.peek());
		}
		else if("POP".equals(oper))
		{
			stack.pop();
		}
		else if("+".equals(oper))
		{
			if(stack.size() < 2) throw new EmptyStackException();
			int tmp = (stack.pop());
			int tmp2 = (stack.pop());
			stack.push((tmp+tmp2));
		}
		else if("-".equals(oper))
		{
			if(stack.size() < 2) throw new EmptyStackException();

			int tmp = (stack.pop());
			int tmp2 = (stack.pop());
			stack.push((tmp-tmp2));
		}
		
	}
	public static boolean isInt(String oper)
	{
		try {
			Integer.parseInt(oper);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		
	}
}
