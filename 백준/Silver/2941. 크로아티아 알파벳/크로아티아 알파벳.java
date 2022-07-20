import java.util.Scanner;

class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] stra = {"c=","c-","dz=","d-","lj","nj","s=","z="}; // 각각이 한 단어이다. 
		char[] stra2 = {'c','l','n','s','z'};
		
		int[] iarr = new int[8];
		
		int croword = 0;
		int resultwordlength = 0;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(i != s.length()-1)
			{
				
				for(int k = 0 ; k < stra2.length ; k++)
				{
					
					if(s.charAt(i) == stra2[k])
					{
						String words = String.valueOf(new char[]{s.charAt(i) , s.charAt(i+1)});
						for(int j = 0 ; j < stra.length ; j++)
						{
							if(stra[j].equals(words))
							{
								croword++;
							}
						}
					}
					
				}	
					if(s.charAt(i) == 'd')
					{
						String words1 = new String();
						String words = String.valueOf(new char[]{s.charAt(i) , s.charAt(i+1)});

						for(int j = 0 ; j < stra.length ; j++)
						{
							if(stra[j].equals(words))
							{
								croword++;
							}
						}
						
						if(i != s.length()-2)
						{
							words1 = String.valueOf(new char[]{s.charAt(i) , s.charAt(i+1) , s.charAt(i+2)});
							
							for(int j = 0 ; j < stra.length ; j++)
							{
								if(stra[j].equals(words1))
								{
									croword += 2;
									i += 1;
								}
							}
						}
					}
	
			}
			
		}
		resultwordlength = s.length() - croword;
		System.out.print(resultwordlength);
		
	

	}

}
