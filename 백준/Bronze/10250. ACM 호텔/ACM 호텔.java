import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int count = Integer.parseInt(s);
		String[] arr = new String[count];
		
		for(int i = 0 ; i < count ; i++)
		{
			arr[i] = bf.readLine();
		}
	
		//h = 높이 W 는 가로 길이 N 은 몇번쨰 손님인지 .
		//걷는거리가 같을떄는 아래층 방을 선호한다. 
		for(int k = 0; k < arr.length ; k++)
		{
			String[] arr2 = arr[k].split(" "); 
			
			int H = Integer.parseInt(arr2[0]);//높
			int W = Integer.parseInt(arr2[1]);//가로
			int N = Integer.parseInt(arr2[2]);//순번
			
			int countNum = 0;
			
			for(int i = 0 ; i < W ; i++)
			{
				for(int j = 0 ; j < H ; j++)
				{
					countNum++;
					if(N == countNum)
					{
						if(i < 9)
						{
							String ans = new String("0" + (i+1));
							System.out.println((j+1) + ans);
							break;
						}
						else
						{
							System.out.printf("%d%d\n",(j+1),(i+1));
							break;
						}
					}
				}
			}
			
		}
		
	}

}
