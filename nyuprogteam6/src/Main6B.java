import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main6B {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int[] c = comb(line);
		ArrayList<int[]> sums= new ArrayList<int[]>();
		while(c[0]!=0 || c[1]!=0 || c[2]!=0 || c[3]!=0)
		{
			int sum[] = new int[1];
			for(int j=0; j<4; ++j) c[j]=(c[j]*(-1)) %40;
			sum[0] = 360*2;
			if( c[0]>c[1]) sum[0]+=360;
			sum[0]+=9*(c[1]-c[0]);
			sum[0]+=360;
			if( c[2]>c[1]) sum[0]+=360;
			sum[0]+=9*(c[1]-c[2]);
			if( c[2]>c[3]) sum[0]+=360;
			sum[0]+=9*(c[3]-c[2]);
			sums.add(sum);
			line = in.readLine();
			c = comb(line);
		}
		for(int i=0; i<sums.size(); ++i)
		{
			System.out.println(sums.get(i)[0]);
		}
		
	}
	static int[] comb(String line)
	{
		String[] l = line.split(" ");
		int[] c = new int[4];
		for(int i=0; i<4; ++i) c[i] = Integer.parseInt(l[i]);
		return c;
	}
}
