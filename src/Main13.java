// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // 자릿수
		String str = in.next(); // 입력값
		char[] ch = new char[str.length()];
		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (int i = 0; i < n; i++) {
			a += Integer.parseInt(str.charAt(i) + "");
		}
		System.out.println(a);
	}
}
