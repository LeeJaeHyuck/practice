/*
 *  734�� 893�� ĥ�ǿ� �����ٸ�, 
 *  ����� �� ���� 437�� 398�� �д´�. 
 *  ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
 */
import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char[] ch = new char[7];
		char a = ' ';
		String num = "";

		for (int i = 0; i < 7; i++) {
			ch[i] = str.charAt(i);
		}
		a = ch[0];
		ch[0] = ch[2];
		ch[2] = a;
		a = ch[4];
		ch[4] = ch[6];
		ch[6] = a;
		for (int i = 0; i < ch.length; i++) {
			num += ch[i];
		}
		
		int x = Integer.parseInt(num.substring(0, 3));
		int y = Integer.parseInt(num.substring(4, 7));
		
		int result = x >= y ? x : y;
		
		System.out.println(result);
	}
}
