import java.util.ArrayList;
import java.util.Scanner;

public class Main4D 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		for(int i=0;i<numTestCases	;i++)
		{
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			ArrayList<double[]> edges = new ArrayList<double[]>();
			for(int j=0; j<n;++j) 
			{
				String[] frecle = in.nextLine().split(" ");
				x[j] = Integer.parseInt(frecle[0]);
				y[j] = Integer.parseInt(frecle[1]);
				for(int k=0;k<j;++k)
				{
					double[] edge = new double[3];
					edge[1]=j; 
					edge[2]=k;
					edge[0] = Math.sqrt(Math.pow(x[j]-x[k],2)+Math.pow(y[j]-y[k], 2));
					edges.add(edge);
				}
			}
			sort(edges, 0, edges.size());
		}
	}
	static void sort(ArrayList<double[]> edges, int L, int R)
	{
		for(int j=0; j<edges.size(); ++j)
		{
			if(edges.get(j)[0]>edges.get(j+1)[0])
			{
				double[] e = edges.get(j);
				for(int i=0; i<3; ++i) edges.get(j)[i] = edges.get(j+1)[i];
				for(int i=0; i<3; ++i) edges.get(j)[i] = e[i];
			}
		}
	}
}