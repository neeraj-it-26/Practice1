package may9thAssignment;

public class Assinment6 {
	private void fibo() 
	{
	int a=0;
	int b=1;
	for (int c = 0; a < 50; ) 
	{
		c= a+b;
		System.out.println(a);
		a=b;
		b=c;
	}
			
	}
public static void main(String[] args) 

{
Assinment6 a6 = new Assinment6();
a6.fibo();
}

}
