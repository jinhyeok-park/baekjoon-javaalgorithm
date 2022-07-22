
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

class Main {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		
		//높이 v
		//A 전진
		//B 후퇴
		
	
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		String[] arr = s.split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int V = Integer.parseInt(arr[2]);
		
		int day1 = (V - B) / (A - B);
		int day2 = (V - B) % (A - B);
		
	
		
		if(V == A)
		{
			System.out.print(1);
		}
		else
		{
			if(day2 == 0)
			{
				System.out.print(day1);
			}
			else
			{
				System.out.print(day1 + 1);
			}
		}
		

	}

}
