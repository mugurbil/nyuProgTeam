import java.util.Arrays;
import java.util.Scanner;


public class Main5B {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] ps = new long[n];
		long[] rs = new long[n];
		for(int i=0; i<n;++i)
		{
			long p = in.nextInt();
			long q = in.nextInt();
			ps[i] = p*100001+q;
			rs[i] = q;
		}
		Arrays.sort(ps);
		Arrays.sort(rs);
		boolean boo = false;
		for(int i=0; i<n; i++)
		{
			long z = (ps[i]-rs[i])%100001;
			if(z!=0)
			{
				boo=true; 
				break;
			}
		}
		if(boo) System.out.println("Happy Alex");
		else System.out.println("Poor Alex");
	}
}

