import java.util.Scanner;

/*
 * �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
 * ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 

�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�.
 �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Main6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int arr[] = { in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		int arr2[] = new int[1000];
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] %= 42;
		}
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]]++;
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0) {
				a++;
			}
		}
		System.out.println(a);
	}
}
