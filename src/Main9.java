
/*
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 *
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
 * �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
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