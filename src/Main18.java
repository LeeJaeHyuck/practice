
/*
 * ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. 
 * �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, 
 * ������ �����ؼ� ������ ���� ����.
 *  ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.
 */
import java.util.*;

public class Main18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (ch[i] == ' ') {
				a++;
			}
		}

		if (ch[0] == ' ' && ch[str.length() - 1] == ' ') {
			a -= 1;
		} else if (ch[0] != ' ' && ch[str.length() - 1] != ' ') {
			a += 1;
		}

		System.out.println(a);

		if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
			System.out.println(str.length() - str.replaceAll(" ", "").length() - 1);
		} else if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ') {
			System.out.println(str.length() - str.replaceAll(" ", "").length());
		} else {
			System.out.println(str.length() - str.replaceAll(" ", "").length() + 1);
		}

	}
}
