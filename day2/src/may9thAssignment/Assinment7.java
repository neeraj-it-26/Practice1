package may9thAssignment;

import java.util.Scanner;

public class Assinment7 
{
	private void factorial(int a) 
	{
		int result=1;
		for (int i = a; i > 0; i--) 
		{
		 result = result*a;
			//System.out.println(a);
			a--;
			
		}
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
	Assinment7 a7 = new Assinment7();
	Scanner s = new Scanner(System.in);
	System.out.println("enter the Digit");
	int a = s.nextInt();
	a7.factorial(a);
	
	
	}
}
