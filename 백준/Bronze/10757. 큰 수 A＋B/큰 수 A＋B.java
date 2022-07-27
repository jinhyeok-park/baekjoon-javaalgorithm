import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		
		String[] arr = s.split(" ");
		
		
		BigInteger bi = new BigInteger(arr[0]);
		BigInteger bi2 = new BigInteger(arr[1]);
		BigInteger ab= bi.add(bi2);
		
		String result = ab.toString();
		System.out.print(result);
		
		
		
		
		
	}

}
