package may9thAssignment;

import java.util.Scanner;

public class Assinment1 {

	public void swap(int a, int b, int c)
	{
		c=a;
		a=b;
		b = c;
		System.out.println("New value in A = " +a);
		System.out.println("New value in B = " +b);
	}
	public static void main(String[] args) {
		Assinment1 a1 = new Assinment1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		int x =s.nextInt();
		System.out.println("Enter the Value of B");
		int y = s.nextInt();
		a1.swap(x, y, 0);
		
	}
}
