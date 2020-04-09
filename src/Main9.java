
/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 *
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 * 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 */
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int c = in.nextInt();
		int[] n = new int[c];
		int[] a = null;
		int sum = 0;
		double avg = 0;
		int k;
		int z;
		int g = 0;

		for (int i = 0; i < c; i++) {
			n[i] = in.nextInt();
			a = new int[n[i]];
			for (int j = 0; j < a.length; j++) {
				a[j] = in.nextInt();
			}
			for (k = 0; k < a.length; k++) {
				sum += a[k];
			}
			avg = sum / k;
			for (z = 0; z < a.length; z++) {
				if (avg < a[z]) {
					g++;
				}
			}
			double f = (double) g / z * 100;
			System.out.printf("%5.3f\n", f);
			sum = 0;
			g = 0;
		}
	}
}