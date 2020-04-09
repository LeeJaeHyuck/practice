/*
 * ¼¿ÇÁ ³Ñ¹ö
 */
import java.util.*;

public class Main12 {

	public static void main(String[] args) {
		int n[][] = new int[10001][10001];
		//int[] selfNum = new int[10000];
		HashSet<Integer> set = new HashSet<>();

		// 1~10000 °ª
		for (int i = 0; i < 10000; i++) {
			//selfNum[i] = i + 1;
			set.add(i + 1);
		}

		
		for (int i = 0; i < 10001; i++) {
			n[i][0] = i + 1;
			for (int j = 0; j < 10001; j++) {
				n[i][j + 1] = n[i][j] + (n[i][j] / 1000) + ((n[i][j] / 100) % 10) + ((n[i][j] / 10) % 10)
						+ n[i][j] % 10;
				if (n[i][j] > 10000) {
					break;
				}
			}
		}
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < 10000; j++) {
				if (set.contains(n[i][j]) && j != 0) {
					set.remove(n[i][j]);
				}
			}
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
class Test{
	int n;
			
		public int getdn(int n) {
		int d = n;
		d += d%10;
		n /= 10;
		return d;
	}
}
