package Top30InterviewQ;

import java.util.Scanner;

public class Prime1toN {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int i=0;
		int num=0;
		
		String primeNumber=" ";
		System.out.println("Enter to number to find the prime numbers from 1 to n");
			
		int n=scan.nextInt();
			
		for(i=1;i<=n;i++){
		
			int counter=0;
			for(num=i;num>=i;num--)
		
			{
				if(i%num==0)
				{
					counter= counter+1;
					
				}
			}
		
		if(counter==2){
			
			primeNumber=primeNumber + i + " ";
		}	
	}
		System.out.println("Prime numbers from 1 to " +num +" are :");
		System.out.println(primeNumber);

	
	
	{
		System.out.println(50%5==0);
	}
	}
}
