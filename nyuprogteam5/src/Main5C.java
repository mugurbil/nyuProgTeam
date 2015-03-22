import java.io.*;
import java.util.HashMap;


public class Main5C {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<String, String>();
		String line = in.readLine();
		while(!line.isEmpty())
		{
			String[] l = line.split(" ");
			map.put(l[1], l[0]);
			line = in.readLine();
		}
		line = in.readLine();
		while(line!=null)
		{
			if(map.get(line)==null) System.out.println("eh");
			else System.out.println(map.get(line));
			line = in.readLine();
		}
	
	}
}
