package double_loop;

/* 
     *
    **
   ***
  ****
 *****
 */

public class Assignment6 
{
	private void method() 
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 5; j >= 1; j--) 
			{
				if (j>i) {	
				System.out.print(" ");	
				}
				else
					{
						System.out.print("*");
					
					}		
				
			}	
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Assignment6 a6 = new Assignment6();
		a6.method();
	}
}
