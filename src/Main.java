import java.util.Scanner;

/*
 * ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������� �˶� �ð� H�� M���� �ǹ��Ѵ�.
�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. 
�ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); // ��
		int M = in.nextInt(); // ��
		if (0 <= H && H <= 23 && 0 <= M && M <= 59) {
			M -= 45;
			if (M < 0) {
				M = 60 + M;
				H -= 1;
				if (H < 0) {
					H = 24 + H;
					System.out.println(H + " " + M);
				} else {
					System.out.println(H + " " + M);
				}
			} else {
				System.out.println(H + " " + M);
			}
		} 
	}

}
