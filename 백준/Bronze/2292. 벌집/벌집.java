import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//중심부 1 에서 시작하여 
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		int count = 1;
		int minimum = 2;
		
		if(s==1)
		{
			System.out.print(1);
		}
		else
		{
			while(minimum <= s)
			{
				minimum += 6 *count ; 
				count++;
			}

			System.out.print(count);

		}
	}

}
