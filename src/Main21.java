import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (j == 0) {
					System.out.print('*');
				} else {
					if (j % 2 == 0) {
						System.out.print(' ');
						System.out.print('*');
					}
				}
			}
			System.out.println();
			for (int j = 0; j < a; j++) {
				if (j % 2 == 1) {
					System.out.print(' ');
					System.out.print('*');
				}
			}
			System.out.println();

		}

	}

}