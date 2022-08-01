
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String[] arr = s.split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		
		ArrayList<Boolean> ls = new ArrayList<>(N+1);
		
		ls.add(false);
		ls.add(false);
		for(int i = 2 ; i <= N ; i++)
		{
			ls.add(i,true);
		}
		
		for(int i = 2; i*i <= N ; i++)
		{
			if(ls.get(i))
			{
				for(int j = i*i ; j <= N ; j+=i)
				{
					ls.set(j, false);
				}
			}
		}
		for(int start = M ; start <= N ; start++)
		{
			if(ls.get(start))
			{
				System.out.println(start);
			}
		}
		
			
		
	}

}
