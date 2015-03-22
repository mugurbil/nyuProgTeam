import java.util.Scanner;


public class Main4B {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String line = in.next();
		char[] row = new char[n];
		for(int i=0; i<n; i++) row[i]=line.charAt(i);
		System.out.println(search(row,n));
	}
	static int search(char[] row, int n)
	{
		int count=0;
		for(int i=1; i<n;++i)
		{
			if(row[i]==row[i-1])
			{
				count++;
				row[i]=row[i-1];
			}
		}
		return count;
	}
}
