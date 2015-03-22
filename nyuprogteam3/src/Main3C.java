

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3C 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line= in.readLine().split(" ");
		int n = Integer.parseInt(line[0], 10);
		int m = Integer.parseInt(line[1], 10);
		int k = Integer.parseInt(line[2], 10);
		long[] a = new long[m+1];
		int count =0;
		for(int i=0; i<m+1; i++)
		{
			long b = Integer.parseInt(in.readLine(), 10);
			a[i]=b;
		}
		for(int i=0; i<m; i++)
		{
			int number = numdif(a[i],a[m],n);
			if( number<=k)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static int numdif(long a, long b, int n)
	{
		int number=0;
		for(int i=0; i<n; i++)
		{
			long z = (a-b)%2;
			if( z!=0 ) number++;
			a=a/2;
			b=b/2;
		}
		return number;
	}
	
}
