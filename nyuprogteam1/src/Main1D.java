import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main1D 
{
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		int k = in.nextInt();
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while( a!=0 )
		{
			digits.add((int) (a%10));
			a/=10;
		}
		Collections.reverse(digits);
		for( int i=0; i<digits.size() & k>0; i++)
		{
			int index = -1;
			int high = digits.get(i);
			for ( int j=1; (j+i)<digits.size() & j<=k; j++)
			{
				if( digits.get(i+j)>high)
				{
					index=j+i;
					high=digits.get(j+i);
				}
			}
			if (index!=-1)
			{
				for ( int j=index; j>i & k>0; j--)
				{
					Collections.swap(digits, j, j-1);
					k--;
				}
			}
		}
		long anew = 0;
		for(int i=0; i < digits.size(); ++i) anew = anew*10 + digits.get(i);
		System.out.println(anew);
	}
	
}
