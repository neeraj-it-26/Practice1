package double_loop;
/*

*****
****
***
**
*

*/
public class Assignment2 
{
	private void method() 
	{
		for (int i = 5; i > 0; i--) 
		{
			for (int j = i; j >0; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment2 a2 = new Assignment2();
		a2.method();
 	}
}
