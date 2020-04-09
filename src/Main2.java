import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int result;

		if (A >= B) {
			result = A <= C ? A : (C >= B ? C : B);
			System.out.println(result);
		} else {
			result = B <= C ? B : (C >= A ? C : A);
			System.out.println(result);
		}

	}
}