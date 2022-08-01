
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ls;
		ArrayList<Boolean> primels;
		int max = 123456;
		
		primels = new ArrayList<Boolean>(max*2 + 1);
		ls = new ArrayList<Integer>();
		boolean zero = true;
		primels.add(false);
		primels.add(false);
		
		
		for(int i = 2 ; i <= max*2 ; i++)
		{
			primels.add(i,true);
		}
		for(int i = 2; i*i <= max*2 ; i++)
		{
			if(primels.get(i))
			{
				for(int j = i*i ; j <= max*2 ; j+=i)
				{
					primels.set(j, false);
				}
			}
		}
		while(zero)
		{
			String s = br.readLine();
			int num = Integer.parseInt(s);
			if(num == 0)
			{
				zero = false;
			}
			else
			{
				ls.add(num);
			}
		}
		for(int i = 0 ; i < ls.size() ; i++)
		{
			int count = 0;
			int n = ls.get(i);
			int m = n*2;
			
			for(int start = n+1 ; start <= m ; start++)
			{
				if(primels.get(start))
				{
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
