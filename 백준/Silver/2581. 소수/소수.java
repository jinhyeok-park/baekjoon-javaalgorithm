import java.util.*;
import java.io.*;


class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//소수값으 합과 최속ㅅ값 찾는 프로그램
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String m = br.readLine();
		String n = br.readLine();
		
		int M = Integer.parseInt(m);
		int N = Integer.parseInt(n);
		
		ArrayList<Integer> al = new ArrayList<Integer>();//소수를 담을 list
		
		for(int start = M ; start <= N ; start++)
		{
			if(start == 2 || start == 3)
			{
				al.add(start);
			}
			else if(start == 1)
			{
				continue;
			}
			else
			{
				for(int i = 2 ; i < start ; i++)
				{
					if(start % i == 0)
					{
						break;
					}
					else if(i == start -1)
					{
						al.add(start);
					}
				}
			}
		}
		//합산식
		int sum = 0;
		
		for(int i = 0 ; i < al.size() ; i++)
		{
			sum += al.get(i);
		}
		if(sum == 0)
		{
			System.out.print(-1);
			return;
		}
		else
		{
			int minimum = al.get(0);
			for(int i = 0 ; i < al.size() ; i++)
			{
				if(minimum > al.get(i))
				{
					minimum = al.get(i);
				}
			}
			System.out.println(sum);
			System.out.println(minimum);
		}
	}

}
