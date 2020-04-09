import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String[] str = new String[n];
		char ch;
		int a = 0;
		int[] c = new int[n];

		for (int i = 0; i < str.length; i++) {
			str[i] = in.next();
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				ch = str[i].charAt(j);
				if (ch == 'O') {
					a++;
					c[i] += a;
				} else {
					a = 0;
				}
			}
			a = 0;
			System.out.println(c[i]);
		}
	}
}
