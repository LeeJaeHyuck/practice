
/*
 * 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 
 * 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 
 * 공백이 연속해서 나오는 경우는 없다.
 *  또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
 */
import java.util.*;

public class Main18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		int a = 0;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (ch[i] == ' ') {
				a++;
			}
		}

		if (ch[0] == ' ' && ch[str.length() - 1] == ' ') {
			a -= 1;
		} else if (ch[0] != ' ' && ch[str.length() - 1] != ' ') {
			a += 1;
		}

		System.out.println(a);

		if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
			System.out.println(str.length() - str.replaceAll(" ", "").length() - 1);
		} else if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ') {
			System.out.println(str.length() - str.replaceAll(" ", "").length());
		} else {
			System.out.println(str.length() - str.replaceAll(" ", "").length() + 1);
		}

	}
}
