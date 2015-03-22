import java.util.Scanner;


public class Main8A 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in = new Scanner( System.in);
		int n=in.nextInt();
		String l = "";
		int c=0;
		while(n!=0)
		{
			c++;
			l+="Case "+Integer.toString(c)+": ";
			int[] nums = new int[n];
			for(int i=0;i<n;++i)
			{
				nums[i]=in.nextInt();
			}
			l+=find(nums)+"\n";
			n=in.nextInt();
		}
		System.out.println(l);
	}
	static String find(int[] nums)
	{
		int its=-1;
		for(int j=0; j<1001;j++)
		{
			int a = nums[0];
			int b;
			int sum=0;
			for(int i=0;i<nums.length-1;i++)
			{
				b=nums[i];
				nums[i]=Math.abs(nums[i+1]-b);
				sum+=nums[i];
			}
			nums[nums.length-1]=Math.abs(nums[nums.length-1]-a);
			sum+=nums[nums.length-1];
			if(sum==0)
			{
				its=j;
				break;
			}
		}
		String r="";
		if(its==-1)
		{
			r="not attained";
		}
		else
		{
			r=Integer.toString(its)+" iterations";
		}
		return r;
	}
}
