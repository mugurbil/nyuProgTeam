
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2C {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		int num = 10;
		for (int j = 0; j < test; j++) {

			String[] name = new String[num];
			int[] val = new int[num];
			int max = 0;

			for (int i = 0; i < num; i++) {
				String l = in.readLine();
				String[] line = l.split(" ");
				name[i] = line[0];
				val[i] = Integer.parseInt(line[1]);
				if (val[i] > max) {
					max = val[i];
				}
			}
			System.out.println("Case #" + Integer.toString(j + 1) + ":");
			for (int k = 0; k < num; k++) {
				if (val[k] >= max) {
					System.out.println(name[k]);
				}
			}
		}
	}
}
