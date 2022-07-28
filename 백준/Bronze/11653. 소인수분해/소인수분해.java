
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int Num = Integer.parseInt(s);
		
		int temp = 0;
		for(int i = 2 ; i <= Num ;)
		{
			if(Num % i == 0)
			{
				Num = Num / i;
				System.out.println(i);
				
			}
			else
			{
				i++;
			}
		}
	}

}
