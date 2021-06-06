package sample;

public class a2 {
	/**
	 * ���̰� n�� �迭�� 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ����� Ȯ���Ϸ��� �մϴ�. 1���� n���� ���ڰ� �ߺ� ���� �� ����
	 * ��� �ִ� ��� true��, �ƴ� ��� false�� ��ȯ�ϵ��� �Լ� solution�� �ϼ����ּ���.
	 * 
	 * ���ѻ��� �迭�� ���̴� 10�� �����Դϴ�. �迭�� ���Ҵ� 10�� ������ �ڿ����Դϴ�. ����� �� arr result [4, 1, 3, 2]
	 * true [4, 1, 3] false ����� �� ���� ����� �� #1 �Է��� [4, 1, 3, 2]�� �־��� ���, 1���� 4���� ���ڰ�
	 * ��� ��� �����Ƿ� true�� ��ȯ�ϸ� �˴ϴ�.
	 * 
	 * ����� �� #2 [4, 1, 3]�� �־��� ���, 2�� �����Ƿ� false�� ��ȯ�ϸ� �˴ϴ�.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 4;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 2;
		System.out.println(solution(arr));
	}

	public static boolean solution(int[] arr) {
		boolean answer = true;
		try {
			char[] bArr = new char[arr.length];

			for (int i = 0; i < arr.length; i++) {
				int idx = arr[i];
				bArr[idx-1] = 'Y';
			}
			for (int j = 0; j < bArr.length; j++) {
				if (bArr[j] != 'Y') {
					answer = false;
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			answer = false;
		}
		return answer;

	}
}
