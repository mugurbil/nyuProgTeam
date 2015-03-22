


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3A 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] k= in.readLine().split(" ");
		int n = Integer.parseInt(k[0], 10);
		int m = Integer.parseInt(k[1], 10);
		for( int i=0; i<n; i++)
		{
			String line = in.readLine();
			String b = "";
			for( int j=0; j<m; j++)
			{
				if( line.charAt(j)=='-') b=b+"-";
				else
				{
					String a;
					if( (j+i)%2==0) a="W";
					else a="B";
					b=b+a;
				}
			}
			System.out.println(b);
		}	
	}
}
