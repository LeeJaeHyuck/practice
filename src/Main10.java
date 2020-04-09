import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = n;
		int b = 0;

		while (true) {
			if ((n / 10) + (n % 10) >= 10) {
				n =((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
				b++;
			}else {
				n = ((n % 10) * 10) + (n / 10 + n % 10);
				b++;
			}
			if (a == n) {
				break;
			}
		}
		System.out.println(b);
	}
}
