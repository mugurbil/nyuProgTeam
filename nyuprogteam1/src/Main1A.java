
import java.util.Scanner;

public class Main1A {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int[] inputs = new int[10];

		for (int i = 0; i < 10; i++) {
			int height = userInput.nextInt();
			inputs[i] = height;
		}
		int[] max = new int[3];
		for (int i = 0; i < 10; i++) {
			if (inputs[i] > max[0]) {
				max[2] = max[1];
				max[1] = max[0];
				max[0] = inputs[i];

			} else if (inputs[i] > max[1]) {
				max[2] = max[1];
				max[1] = inputs[i];

			} else if (inputs[i] > max[2]) {
				max[2] = inputs[i];

			}

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(max[i]);
		}
	}
}