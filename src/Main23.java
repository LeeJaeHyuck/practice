import java.util.Scanner;
import java.util.StringTokenizer;

/* 크로아티아
 */
public class Main23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String a = "c=";
		String b = "c-";
		String c = "dz=";
		String d = "d-";
		String e = "lj";
		String f = "nj";
		String g = "s=";
		String h = "z=";
		int num = 0;

		if (str.indexOf(a) != -1) {
			num++;
		}
		if (str.indexOf(b) != -1) {
			num++;
		}
		if (str.indexOf(c) != -1) {
			num++;
		}
		if (str.indexOf(d) != -1) {
			num++;
		}
		if (str.indexOf(e) != -1) {
			num++;
		}
		if (str.indexOf(f) != -1) {
			num++;
		}
		if (str.indexOf(g) != -1) {
			num++;
		}
		if (str.indexOf(h) != -1) {
			if (str.indexOf(h) > 0) {
				if (str.charAt(str.indexOf(h) - 1) != 'd')
					num++;
			}else if(str.indexOf(h) == 0){
				num++;
			}
		}
		str.StringTokenizer();
		System.out.println(num);
	}
}
