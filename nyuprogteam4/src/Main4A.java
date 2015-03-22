import java.io.IOException;
import java.util.Scanner;


public class Main4A 
{
	public static void main(String[] args)throws IOException
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int number;
		while((number = in.nextInt())!=0)
		{
			while( number>9) number=sum(number);
			System.out.println(number);
		}
	}
	static int sum(int number)
	{
		int sum = 0;
		for(int i = 0; i<10; ++i)
		{
			sum+=(number%10);
			number/=10;
		}
		return sum;
	}

}
