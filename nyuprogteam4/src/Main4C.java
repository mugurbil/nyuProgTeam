import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class Main4C {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		BigInteger[] fib = findFib();
		ArrayList<Integer> inds = new ArrayList<Integer>();
		while(in.hasNext())
		{
			inds.add(in.nextInt());
		}
		for( int i=0; i<inds.size(); i++)
		{
			System.out.println("The Fibonacci number for "+Integer.toString(inds.get(i))+ " is "+ fib[inds.get(i)].toString());

		}
		
	}
	public static BigInteger[] findFib()
	{
		BigInteger[] fib= new BigInteger[5001];
		fib[0]=BigInteger.ZERO;
		fib[1]=BigInteger.ONE;
		for(int i=2; i<5001; ++i)
		{
			fib[i]=fib[i-1].add(fib[i-2]);
		}
		return fib;
	}
}
