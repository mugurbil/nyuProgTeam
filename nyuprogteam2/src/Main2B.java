
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2B {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		String[] line1 = in.readLine().split(" ");
		String[] line2 = in.readLine().split(" ");

		int p = Integer.parseInt(line1[0]);
		int q = Integer.parseInt(line2[0]);

		if (p + q < n) {
			System.out.println("Oh, my keyboard!");
			System.exit(0);
		} else {

			int[] full = new int[n];

			for (int i = 1; i < line1.length; i++) {

				full[Integer.parseInt(line1[i]) - 1]++;

			}
			for (int i = 1; i < line2.length; i++) {
				full[Integer.parseInt(line2[i]) - 1]++;

			}
			for (int i = 0; i < n; i++) {

				if (full[i] < 1) {
					System.out.println("Oh, my keyboard!");
					System.exit(0);
				}

			}

			System.out.println("I become the guy.");

		}

	}
}
