package Top30InterviewQ;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int num=50;
		int count=0;
		
		int m=num/2;
		
		for(int i=2;i<=m;i++)
		{
			//System.out.println(i);
			if(num%i==0)
			{
				System.out.println(+num+ " number is not prime");
				count=1;
				break;
			}
		}
			if(count==0)
			{
				System.out.println(+num+" number is prime");
			}
		

	}
}



