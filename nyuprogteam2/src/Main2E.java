

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2E {
	
	public static int findPath(String[][] parknew, int[] oknew, int x, int y, int n, String low, int m)
	{
		String[][] park = parknew;
		park[x][y]="";
		if(x==n-1 && y==n-1){
			return 1;
		}else{
			int[] nums = new int[4];
			nums[0]=m;
			nums[1]=m;
			nums[2]=m;
			nums[3]=m;
			
			if(y<n-1)
			{

				int[] ok = oknew;
				String letter = park[x][y+1];
				if( letter.isEmpty()){
				}else{
					int index = low.indexOf(letter);
					if( index<10 && ok[index]<1){
						ok[index]=-1;
						nums[0] = findPath(park, ok, x, y+1, n, low, m-1)+1;
					}else if(index>=10 && ok[index-10]>-1){
						ok[index-10]=1;
						nums[0] = findPath(park, ok, x, y+1, n, low, m-1)+1;
					}
				}
			}
			
			if(x<n-1)
			{

				int[] ok = oknew;
				String letter = park[x+1][y];
				if( letter.isEmpty()){
				}else{
					int index = low.indexOf(letter);
					if( index<10 && ok[index]<1){
						ok[index]=-1;
						nums[1] = findPath(park, ok, x+1, y, n, low, m-1)+1;
					}else if(index>=10 && ok[index-10]>-1){
						ok[index-10]=1;
						nums[1] = findPath(park, ok, x+1, y, n, low, m-1)+1;
					}
				}
			}
			
			if(y>0)
			{

				int[] ok = oknew;
				String letter = park[x][y-1];
				if( letter.isEmpty()){
				}else{
					int index = low.indexOf(letter);
					if( index<10 && ok[index]<1){
						ok[index]=-1;
						nums[2] = findPath(park, ok, x, y-1, n, low, m-1)+1;
					}else if(index>=10 && ok[index-10]>-1){
						ok[index-10]=1;
						nums[2] = findPath(park, ok, x, y-1, n, low, m-1)+1;
					}
				}
			}
			
			if(x>0)
			{

				int[] ok = oknew;
				String letter = park[x-1][y];
				if( letter.isEmpty()){
				}else{
					int index = low.indexOf(letter);
					if( index<10 && ok[index]<1){
						ok[index]=-1;
						nums[3] = findPath(park, ok, x-1, y, n, low, m-1)+1;
					}else if(index>=10 && ok[index-10]>-1){
						ok[index-10]=1;
						nums[3] = findPath(park, ok, x-1, y, n, low, m-1)+1;
					}
				}
			}
			return Math.min(Math.min(nums[0], nums[1]),Math.min(nums[2], nums[3]));
		}
		
	}
	
	public static void main(String[] args) throws Exception, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int m = n*n+1;
		String[][] park = new String[n][n];
		int[] ok = new int[10];
		String low = "abcdefghijABCDEFGHIJ";
		for( int i=0; i<n; i++ )
		{
			String line = in.readLine();
			for(int j=0; j<n; j++)
			{
				park[i][j]=Character.toString(line.charAt(j));
			}
		}
		int index = low.indexOf(park[0][0]);
		if(index<10) ok[index]=-1;
		else ok[index-10]=1;
	
		int num=findPath(park, ok, 0, 0, n, low, m);
		if(num==m)System.out.println(-1);
		else System.out.println(num);
	}
}
