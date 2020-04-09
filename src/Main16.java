/*
 * 알파벳 대소문자로 된 단어가 주어지면, 
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		char ch[] = new char[str.length()];
		int a = 0;
		
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for(char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == i) {
					str.indexOf(ch[j]);
				}
			}
		}
	}
}
