
import java.util.Scanner;

class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 1 23 456 78910 ...
		//if num = 3 ans = 2/1
		//count = 1 count ++
		int count = 1; // 페이지 숫자 
		// 홀짝 으로 나누어서 짝수일때 분모로 page넘 시작 , 
	
		int page = 0;
		while(page < num)
		{
			page = 0;
			
			for(int i = 1 ; i <= count ; i++)
			{
				page += i;
			}
			count++;
		}
		int level = count-1;
		int startnum  = page - level;
		int countnum = num - startnum;
		
		int mom = 0;
		int son = 0;
		
		if(level % 2 == 0)
		{
			//분모가 
			for(int i = 1 ; i <= countnum ; i++)
			{
				mom = level -( i - 1);
				son = i;
			}
			System.out.print(son+"/"+mom);
		}
		else
		{
			for(int i = 1 ; i <= countnum ; i++)
			{
				mom = i;
				son = level -( i - 1);
			}
			System.out.print(son+"/"+mom);
		}
		
	}
	
	

}
