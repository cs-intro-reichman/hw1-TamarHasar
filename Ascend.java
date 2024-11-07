// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);

		System.out.println(a + " " + b + " " + c);

		int sum = a + b + c;

		int min = Math.min(a, b);
		int minFinal = Math.min(min,c);
		int max = Math.max(a, b);
		int maxFinal = Math.max(max,c);

		int mid = sum - minFinal - maxFinal;

		System.out.println(minFinal + " " + mid + " " + maxFinal);
	}
}
