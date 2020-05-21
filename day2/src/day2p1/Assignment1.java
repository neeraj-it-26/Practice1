package day2p1;
//((((10+2)-2)+2)*2)/2)

public class Assignment1 {
	public int sum(int a,int b)
	{
		return a +b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
		
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		Assignment1 a1 = new Assignment1();
		int a = a1.sum(10, 2);
		int b = a1.sub(a, 2);
		System.out.println(b);
	}

}
