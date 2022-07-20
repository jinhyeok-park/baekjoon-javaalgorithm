import java.util.Scanner;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String[] s = new String[c];
		
		
		char temp = ' ';
		int count = 0;
		for(int i = 0 ; i < c ; i++)
		{
			s[i] = sc.next();
		}
		
		//그룹단어를 설정하자 앞서 나온단어가 연속이 아니라 다른 단어 뒤에서 나온다면 그룹문자가 아니다. 
		
		for(int i = 0 ; i < s.length ; i++)
		{
			ArrayList<Character> ls = new ArrayList<>();
			boolean groupword = true;
			for(int j = 0 ; j < s[i].length() - 1 ; j++)// 새로운 단어가 누적
			{	
				
				if(s[i].charAt(j) != s[i].charAt(j+1))
				{
					ls.add(s[i].charAt(j)); // 달라지는 단어를 추가하여 넣는다 distinict
				}
				else
				{
					continue;
				}
				
				//검출기 동작부
				if(!ls.equals(null))
				{
					for(int k = 0 ; k < ls.size() ; k++)
					{
						if(ls.get(k) == s[i].charAt(j+1))
						{
							groupword = false;// 
						}
					
					}
				}
			}
			if(groupword)// 결과 적용부
			{
				count++;
			}
		}
		System.out.print(count);
	}

}




