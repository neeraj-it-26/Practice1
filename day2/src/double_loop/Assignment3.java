package double_loop;
/*
                 1
                 12
                 123
                 1234
                 12345 
 */


public class Assignment3 
{
	private void method() 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment3 a3 = new Assignment3();
		a3.method();
	}
}
