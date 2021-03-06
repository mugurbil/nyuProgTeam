import java.io.*;
import java.util.StringTokenizer;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] list=calc();
		String line;
		while((line = in.readLine()) != null)
		{
			if (line.isEmpty()) break;
			StringTokenizer st = new StringTokenizer(line);
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int max=0;
			for(int k=Math.min(i, j); k<=Math.max(i, j); k++)
			{
				if(list[k]>max) max=list[k];
			}
			sb.append(i);
			sb.append(" ");
			sb.append(j);
			sb.append(" ");
			sb.append(max);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
	static int[] calc()
	{
		int[] list = new int[1000002];
		for(int k=1; k<1000001; k++)
		{
			int count = 1;
			long n = k;
			while( n!=1)
			{
				long r = n%2;
				if(r==1) n=3*n+1;
				else if(r==0) n=n/2;
				count++;
			}
			list[k]=count;
		}
		return list;
	}
}
