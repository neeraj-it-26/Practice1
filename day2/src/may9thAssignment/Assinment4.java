package may9thAssignment;

import java.util.Scanner;

public class Assinment4 {

	private void armstrong() 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number ");
	int digit1 = s.nextInt();
	int digit = digit1;
	int original_number=digit1;
	int count = 0;
	while (digit !=0) 
	{
		digit = digit/10;
		count++;
	}
	int result;
	for (result = 0; digit1 >0 ; digit1 = digit1/10) {
		int remainder = digit1%10;
		remainder = (int) Math.pow(remainder, count);
		result = result + remainder;	
	}
	//System.out.println(result);
	if (original_number==result) {
		System.out.println( original_number + " is an Armstrong number");
		
	} else 
	{
		System.out.println( original_number + " is not an Armstrong number");
	}
    }
	public static void main(String[] args) {
		Assinment4 a4 = new Assinment4();
		a4.armstrong();
	}
}
