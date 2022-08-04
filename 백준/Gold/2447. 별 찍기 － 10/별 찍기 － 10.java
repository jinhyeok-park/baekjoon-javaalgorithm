import java.util.*;
import java.io.*;

class Main {

	static int[][] arr;
	
	public static void initarr(int[][] arr1)
	{
		for(int i = 0 ; i < arr1.length ; i++)
		{
			for(int j = 0 ; j < arr1.length ; j++)
			{
				arr1[i][j] = 0;
			}
		}
	}
	
	public static void recursion(int size,int x , int y, boolean blank)
	{
		//num = 3의 거듭제곱
		if(blank) {
			for(int i = x ; i < x + size ; i++)
			{
				for(int j = y ; j < y + size ; j++)
				{
					arr[i][j] = 1;
				}
			}
		}
		
		if(size == 1)
		{
			return;
		}

		int blocksize = size/3;
		int count = 0;
		for(int i = x; i < x + size ; i+=blocksize)
		{
			for(int j = y ; j < y + size ; j += blocksize)
			{
				count++;
				if(count == 5)
				{
					recursion(blocksize,i,j,true);
				}
				else
				{
					recursion(blocksize,i,j,false);
				}
			}
		}

	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		arr= new int[n][n];
		initarr(arr);
		
		recursion(n,0,0,false);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(arr[i][j] == 1)
				{
					
					sb.append(" ");
				}
				else
				{
					
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);

	}

}
