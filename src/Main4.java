import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[9];
		int a = 0;
		int i;

		for (i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
		}

		for (i = 0; i < num.length; i++) {
			if (num[i] > a) {
				a = num[i];
			}
		}
		for (i = 0; i < num.length; i++) {
			if (a == num[i]) {
				i += 1;
				break;
			}
		}
		System.out.println(a + " " + i);
	}
}
