import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//상근아 그냥 들어줘 제발!
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		int N = Integer.parseInt(s);
		
		int num1 = N / 5;
		int num2 = N - (N % 5);
		int num3 = N / 3;
		int num4 = N % 3;
		int num5 = N % 5;
		int temp = N - num2;;
	
		for(int i = 0 ; i < num1 ; i++) // 5로 나누고 나머지가 3으로 나뉘어지는 경우가 가장 적은경우임 
		{
			if(temp % 3 == 0)
			{
				int numb5 = num2 / 5;
				int numb3 =  temp / 3;
				System.out.print(numb5 + numb3);
				return;
			}
			else
			{
				num2 -= 5;
				temp = N - num2;
			}
		}
		if(num5 == 0)
		{
			System.out.print(num1);
		}
		else if(num4 == 0)
		{
			System.out.print(num3);
		}
		else
		{
			System.out.print(-1);
		}
	}

}
