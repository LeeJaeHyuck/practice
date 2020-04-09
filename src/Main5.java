import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int result = a * b * c;
		String str = Integer.toString(result);
		int arr[] = new int[str.length()];
		int arr2[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			if (result > 0) {
				arr[i] = result % 10;
				result /= 10;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]] += 1;

		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
