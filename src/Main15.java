
/*
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. 
 * S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
 */
import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i = 0; i < a; i++) {
			int r = in.nextInt();
			String s = in.next();
			String p = "";
			for (int k = 0; k < s.length(); k++) {
				String ch = s.charAt(k) + "";
				for (int j = 0; j < r; j++) {
					p += ch;
				}
			}
			System.out.println(p);
		}
	}
}
