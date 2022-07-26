import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int num = Integer.parseInt(s);
		String[] numarr = new String[num*2];
		
		for(int i = 0 ; i < num * 2 ; i++)
		{
			numarr[i] = bf.readLine();
		}
		
		int[][] building = new int[15][15];
		
		for(int i = 0 ; i < 15 ; i++)
		{
			building[i][0] = 1;
			building[0][i] = i+1;
		}
		
		for(int i = 1 ; i < 15 ; i++)
		{
			for(int j = 1 ; j < 15 ; j++)
			{
				building[i][j] = building[i][j-1] + building[i-1][j];
			}
		}
		
		for(int i = 0 ; i < numarr.length ; i+=2)
		{
			int k = Integer.parseInt(numarr[i]);
			int n = Integer.parseInt(numarr[i+1]);
			
			System.out.println(building[k][n-1]);
		}

	}
	

}
