import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		int result = -1000000;
		int result2 = 1000000;

		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (result <= num[i]) {
				result = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (result2 >= num[i]) {
				result2 = num[i];
			}
		}
		System.out.println(result2 + " " + result);
	}
}
