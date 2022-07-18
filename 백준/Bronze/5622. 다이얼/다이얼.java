
import java.util.Scanner;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//배열을 알파뱃 26까지 선언 2부터 ABC~
		ArrayList<Integer> ls = new ArrayList<>();
		int time = 0;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) >= 65 && s.charAt(i) <= 67)
			{
				ls.add(2);
				time += 3;
			}
			else if(s.charAt(i) >= 68 && s.charAt(i) <= 70)
			{
				ls.add(3);
				time += 4;
			}
			else if(s.charAt(i) >= 71 && s.charAt(i) <= 73)
			{
				ls.add(4);
				time += 5;
			}
			else if(s.charAt(i) >= 74 && s.charAt(i) <= 76)
			{
				ls.add(5);
				time += 6;
			}
			else if(s.charAt(i) >= 77 && s.charAt(i) <= 79)
			{
				ls.add(6);
				time += 7;
			}
			else if(s.charAt(i) >= 80 && s.charAt(i) <= 83)
			{
				ls.add(7);
				time += 8;
			}
			else if(s.charAt(i) >= 84 && s.charAt(i) <= 86)
			{
				ls.add(8);
				time += 9;
			}
			else if(s.charAt(i) >= 87 && s.charAt(i) <= 90)
			{
				ls.add(9);
				time +=10;
			}
		}
		System.out.print(time);
		
		
	}

}
