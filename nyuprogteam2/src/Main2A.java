
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2A {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine(), 10);

		int count = 0;

		for (int i = 1; i <= n; ++i) {

			String line = in.readLine();
			int[] pq = { Integer.parseInt(line.split(" ")[0]),
					Integer.parseInt(line.split(" ")[1]) };
			if (pq[0] + 2 <= pq[1])
				count++;

		}
		System.out.println(count);

	}
}
