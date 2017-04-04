package StringDemo;

public class StringwoSpaces {

	// Program to find actual length of String by ignoring the spaces 
	
	public static void main(String[] args) {
	
		String str="Hello World";
		
		
		int sum=0;
		// method 1 use
		String [] mystring =str.split(" ");
		
		System.out.println(str.replace(" ", "").length());
		
		
		// method 2
		/*int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			
			if(str.charAt(i)==' ')
				{
				continue; 
				}
			sum++;
		}
		System.out.println(sum);*/
				
		}
	}


