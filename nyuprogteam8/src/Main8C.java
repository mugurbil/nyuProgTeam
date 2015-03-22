import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main8C 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in = new Scanner( System.in);
		int n = in.nextInt();
		int k1= in.nextInt();
		int k2= in.nextInt();
		ArrayList<String> list = new ArrayList<>();
		int c = 0;
		while((n+k1+k2)!=0)
		{
			c++;
			long[] h = new long[n];
			for(int j=0; j<n; j++)
			{
				h[j]=in.nextLong()*1000000+j;
			}
			Arrays.sort(h);
			String l="Case "+Integer.toString(c)+"\n";
			int[] min= new int[k1];
			for(int i=0;i<k1;i++)
			{
				min[i]=(int) (h[i]%1000000)+1;
			}
			Arrays.sort(min);
			for(int i=0;i<k1-1;i++)
			{
				l=l+Integer.toString(min[i])+" ";
			}
			l=l+Integer.toString(min[k1-1]);
			l=l+"\n";
			int[] max= new int[k2];
			for(int i=0;i<k2;i++)
			{
				max[i]=(int) (h[n-i-1]%1000000)+1;
			}
			Arrays.sort(max);
			for(int i=1;i<k2;i++)
			{
				l=l+Integer.toString(max[k2-i])+" ";
			}
			l=l+Integer.toString(max[0]);
			list.add(l);
			n = in.nextInt();
			k1= in.nextInt();
			k2= in.nextInt();
		}
		for( int i =0; i<list.size();++i)
		{
			System.out.println(list.get(i));
		}
	}
}
