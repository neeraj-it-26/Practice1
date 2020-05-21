package may9thAssignment;

import java.util.Scanner;

public class Assinment8 
{
private void table(int a) 
	{
		for (int i = 1; i <= 10; i++) {
			int res=a*i;
			System.out.println(res);
			
		}

	}
		public static void main(String[] args) 
		{
			Assinment8 a8 = new Assinment8();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the digit");
			int a = s.nextInt();
			a8.table(a);
		}
}
