/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(s.indexOf(i));
		}
	}
}
