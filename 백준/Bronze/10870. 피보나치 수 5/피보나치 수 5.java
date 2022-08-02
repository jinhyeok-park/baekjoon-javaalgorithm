import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[21];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3 ; i < arr.length ; i++)
		{
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		int n = Integer.parseInt(s);
		
		System.out.print(arr[n]);
	}
}
