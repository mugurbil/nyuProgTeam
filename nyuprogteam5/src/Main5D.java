import java.util.Scanner;


public class Main5D {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int z = s(0, n, k, n);
		System.out.println(z);
	}
	static int s(int L, int R, int k, int n)
	{
		int min = R;
		if(L>=R)
		{ 
			return min; 
		}else
		{
			int t = n;
			int w = (L+R)/2;
			while(w>0)
			{
				t=t-w;
				w=w/k;
			}
			if(t>0) min = s((L+R+1)/2, R, k, n);
			else min = s(L, (L+R)/2, k, n);
			return min;
		}
	}
}
