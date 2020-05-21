package double_loop;
/*
                1
                2 3
                4 5 6
                7 8 9 10
 */


public class Assignment4 
{
	private void method() 
	{
		int k=1;
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment4 a4 = new Assignment4();
		a4.method();
	}
}
