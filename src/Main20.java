/*입력 예 : 5
 * 
 * 출력예 :
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */

import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = a;
		int c = 3;

		for (int i = 0; i < a * 2 - 1; i++) {
			if (i < a) {
				for (int x = 0; x < i; x++) {
					System.out.print(' ');
				}
				for (int j = 0; j < b * 2 - 1; j++) {
					System.out.print('*');
				}
			} else {
				if (a == i) {
					b = a;
				}
				for (int j = 0; j < b - 2; j++) {
					System.out.print(' ');
				}
				for (int x = 0; x < c; x++) {
					System.out.print('*');
				}
				c += 2;
			}
			b -= 1;
			System.out.println();
		}
	}
}
