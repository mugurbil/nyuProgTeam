import java.io.*;

public class Main1B {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] answers = new String[4];
		int[] lengths = new int[4];
		String[] choices = { "A", "B", "C", "D" };

		for (int i = 0; i < 4; i++) {

			String line = in.readLine();
			answers[i] = line;
			lengths[i] = line.length() - 2;

		}
		int greatCount = 0;
		int great = 0;

		for (int i = 0; i < 4; i++) {
			int counter = 0;
			int counter2 = 0;

			for (int j = 0; j < 4; j++) {
				if (i == j) {

				} else if (lengths[i] >= (2 * lengths[j])) {
					counter++;
				} else if ((2 * lengths[i]) <= lengths[j]) {
					counter2++;
				}
			}
			if (counter == 3) {
				great = i;
				greatCount++;
			} else if (counter2 == 3) {
				great = i;
				greatCount++;
			}

		}
		if (greatCount == 1) {
			System.out.println(choices[great]);
		} else {
			System.out.println(choices[2]);
		}

	}
}
