
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int max = 0;
		int n = Integer.parseInt(s);
		int[] arr = new int[n];
		ArrayList<Boolean> primels;
		
		
		for(int i  = 0 ; i < n ; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		primels = new ArrayList<Boolean>(max + 1);
		primels.add(false);
		primels.add(false);
		
		for(int i = 2 ; i <= max ; i++)
		{
			primels.add(i,true);
		}
		
		for(int i = 2; i * i <= max ; i++ )
		{
			if(primels.get(i))
			{
				for(int j = i * i ; j <= max ; j+=i)
				{
					primels.set(j, false);
				}
			}
		}//소수
		
		for(int i = 0 ; i < n ; i++)
		{
			int num = arr[i];
			int up = num / 2;
			int down = num / 2;
			
			while(true)
			{
				if(primels.get(up) && primels.get(down))
				{
					System.out.println(down + " " + up);
					break;
				}
				up++;
				down--;
			}
		}
		
		
		
		
	}

}
