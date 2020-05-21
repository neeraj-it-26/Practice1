package may9thAssignment;

import java.util.Scanner;

public class Assinment2 {
	
	private void swap(int a, int b) 
	{
		a = a +b;
		b= a-b;
		a= a-b;

		System.out.println("New value in A = " +a);
		System.out.println("New value in B = " +b);

	}
	public static void main(String[] args) {
		Assinment2 a2 = new Assinment2();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of A ");
		int x = s.nextInt();
		System.out.println("Enter the Value of B ");
		int y = s.nextInt();
		a2.swap(x, y);
		
	}

}
