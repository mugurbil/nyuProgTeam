import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main6C {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner( System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int l = k;
		int[] a = new int[n];
		for(int i=0; i<n; ++i) a[i] = in.nextInt()*100+i;
		Arrays.sort(a);
		ArrayList<int[]> moves = new ArrayList<int[]>();
		int min = (a[n-1]/100)-(a[0]/100);
		while(k>0 & min>1)
		{
			a[n-1]-=100;
			a[0]+=100;
			int[] move = {(a[n-1]%100+1),(a[0]%100+1)};
			moves.add(move);
			Arrays.sort(a);
			min = (a[n-1]/100)-(a[0]/100);
			k--;
		}
		System.out.println(Integer.toString(min)+" "+Integer.toString(l-k));
		for(int i=0; i<moves.size(); ++i)
		{
			System.out.println(Integer.toString(moves.get(i)[0])+" "+Integer.toString(moves.get(i)[1]));
		}
	}
}