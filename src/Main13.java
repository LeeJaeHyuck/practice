// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // �ڸ���
		String str = in.next(); // �Է°�
		char[] ch = new char[str.length()];
		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (int i = 0; i < n; i++) {
			a += Integer.parseInt(str.charAt(i) + "");
		}
		System.out.println(a);
	}
}
