package double_loop;
/* 

     *
    ***
   *****
  *******
 *********
 */

public class Assignment5 
{
	private void method() 
	{
		int k = 0;
		for (int i = 5; i >= 1; i--, k++) 
		{
			for (int j = 1; j <= 5+k; j++) 
			{
				if (i<=j) 
				{
					System.out.print("*");
				} else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Assignment5 a5 = new Assignment5();
		a5.method();
	}
}
