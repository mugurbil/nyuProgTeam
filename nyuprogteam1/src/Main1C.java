
import java.util.Scanner;



public class Main1C {

	public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int numBus = 1;
		int space = m;
		
		for(int i=0; i<n; i++)
		{
			int a = in.nextInt();
			if( a>space ){
				space =m;	
				numBus++;
			}
			space-=a;
		}
		System.out.println(numBus);
	}

}
