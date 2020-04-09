import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] grade = new int[n]; 
		int m = 0;
		double avg[] = new double[n];
		double avg2 = 0;

		for (int i = 0; i < n; i++) {
			grade[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (grade[i] > m) {
				m = grade[i];
			}
		}
		for (int i = 0; i < n; i++) {
			avg[i] = (double) grade[i] / m * 100;
			avg2 += avg[i];
		}
		System.out.println(avg2 / n);
	}
}
