
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		int ans = factorial(n);
		System.out.print(ans);

	}
	
	public static int factorial(int num)
	{
		if(num <= 1)
		{
			return 1;
		}
		
		return num * factorial(num -1);
	}

}
