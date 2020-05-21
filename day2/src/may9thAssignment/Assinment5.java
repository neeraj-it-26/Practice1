package may9thAssignment;

//import java.awt.PageAttributes.OriginType;

public class Assinment5 
{
	static int number = 252;
	static int original_number = number;
	static int result;
	int remainder;
	private void method() {
		
		for (; number > 0;number=number/10 ) {
			remainder = number%10;
			//System.out.println(number);
			result = (result*10)+remainder;
			//number=number/10;
			
		}
		if (result == original_number) {
			System.out.println(original_number + " number is Palindrome");			
		}
		else {
			System.out.println(original_number + " number is not Palindrome");	
		}
		

	}
	
	public static void main(String[] args) {
		Assinment5 a5  = new Assinment5();
		a5.method();
		
	}

	
}
