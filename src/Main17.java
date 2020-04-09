import java.util.Scanner;

public class Main17 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int burger[] = new int[3];
		int drink[] = new int[2];
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < burger.length; i++) {
			burger[i] = sc.nextInt();
		}
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
		}
		
		if (burger[0] >= burger[1]) {
			if(burger[1] >= burger[2]) {
				a = burger[2];
			}else {
				a = burger[1];
			}
		}else {
			if(burger[0] >= burger[2]) {
				a = burger[2];
			}else {
				a = burger[0];
			}
		}
		if (drink[0] >= drink[1]) {
			b = drink[1];
		}else {
			b = drink[0];
		}
		System.out.println(a+b-50);
	}
}
