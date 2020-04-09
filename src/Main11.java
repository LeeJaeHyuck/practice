import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
	}

	public long sum(int[] a) {
		long sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum2 += a[i];
		}
		return sum2;
	}

}
