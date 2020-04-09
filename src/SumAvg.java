
public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~100 ÇÕ°è : " + sum);
		System.out.printf("Æò±Õ : %5.2f", sum / 100.0f);
	}

}
