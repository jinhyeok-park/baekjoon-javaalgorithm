import java.util.Scanner;

class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//손익분기점 프로그램 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		String[] num = s.split(" ");
		
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);;
		int C = Integer.parseInt(num[2]);
		
		if(C <= B)// A / (C-B) BC가 음수가되면,같으면 이익발생불가  
		{
			System.out.print("-1");
		}
		else
		{
			System.out.print((A / (C-B))+1);
		}
		
		
	}

}
