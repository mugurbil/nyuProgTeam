import java.io.IOException;
import java.util.Scanner;


public class Main4F {
	public static void main(String[] args)throws IOException
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[][] p = new String[n][m];
		for(int i=0; i<n; i++)
		{
			p[i] = in.next().split("");
		}
		int a=0;int b =0;
		for(int i=0; i<n; ++i)
		{
			for( int j=0; j<m; ++j)
			{
				if(p[i][j].equals("X"))
				{
					a=i;
					b=j;
					i=n;
					break;
				}
			}
		}
		int row=0;
		for( int l=b; l<m; ++l)
			{
				if(p[a][l].equals("."))
				{
					break;
				}
				row++;
			}
		int col=0;
		for(int i=a+1; i<n; ++i)
		{
			if(p[i][b].equals("."))
			{
				break;
			}
			col++;
		}
		int min = Math.min(row, col);
		boolean printed = false;
		for(int i=a; i<a+col; ++i)
		{
			for( int j=b; j<b+row; ++j)
			{
				if(p[i][j].equals("."))
				{
					System.out.println("-1");
					break;
				}
			}
		}
		if(!printed) System.out.println(Integer.toString(min));
		
	}
}
