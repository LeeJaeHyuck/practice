/*
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
 * �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * 
 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
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
