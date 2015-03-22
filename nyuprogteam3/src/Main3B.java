

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3B {

	public static void main(String[] args) throws Exception, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] k= in.readLine().split(" ");
		int n = Integer.parseInt(k[0], 10);
		int m = Integer.parseInt(k[1], 10);
		String[] l= in.readLine().split(" ");
		
		int count = n;
		int last = -1;
		while( count>0)
		{
			for(int i=0; i<n; i++)
			{
				int a = Integer.parseInt(l[i]);
				
				if( a>0) l[i]=Integer.toString(a-m);
				if( a>0 && a<=m)
				{
					count--; 
					last=i;
				} 
			}
		}
		System.out.println(last+1);
	}
}
