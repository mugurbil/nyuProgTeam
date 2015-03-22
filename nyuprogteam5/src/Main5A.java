import java.util.Scanner;

public class Main5A {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		double p = n*y/100.0;
		double z=0;
		if( p>x)
		{
			z=p-x;
			if((z%1)>0) z=z+1-(z%1);
		}
		int k = (int) z;
		System.out.println(k);
	}
}
