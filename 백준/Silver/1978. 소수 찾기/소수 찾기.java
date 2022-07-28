
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//소수란 자기자신과 1로만 나누어진다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int num = Integer.parseInt(s);
		
		String s2 = br.readLine();
		String[] arr = s2.split(" ");
		int count = 0;
		
		for(int i = 0; i < arr.length ; i++)
		{
			int number = Integer.parseInt(arr[i]);
			if(number == 2 || number == 3)
			{
				continue;
			}
			else if(number == 1)
			{
				count++;
			}
			else
			{
				for(int j = 2 ; j < number ; j++)
				{
					if(number % j == 0)
					{
						count++;
						break;
					}
					
				}
			}
		}
		
		System.out.print(arr.length - count);
	}

}
