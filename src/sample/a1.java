package sample;

public class a1 {
/**
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
����� ��
N	answer
123	6
987	24
����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.

����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int  MAX = 100000000;
		for (int i= 1;  i <= MAX ; i++)
			System.out.println(i +":"+  solution(i));
	}

	public static int solution(int n) {
		int answer = 0;
        int rest = 10;
        while(rest / 10  <= n)
        {
            answer += (n % rest) / (rest / 10) ;
            rest*= 10;
        }
		return answer;
	}
}
