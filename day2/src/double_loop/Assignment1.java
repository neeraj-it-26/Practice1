package double_loop;
/*
 
*
**
***
****

*/
public class Assignment1 {

	private void method() 
	{
		for (int i = 1; i <= 4; i++) 
		{
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
	public static void main(String[] args) {
		Assignment1 a1 = new Assignment1();
		a1.method();
	}
}
