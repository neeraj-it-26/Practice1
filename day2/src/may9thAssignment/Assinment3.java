package may9thAssignment;

public class Assinment3 
{
	int b=0;
 private void prime(int a) 
 {
	 
	 for (int i = 2; i <=a/2 ; i++) 
	 {
		 if (a%i==0) 
		 	{
			 b++;
		 	}		
     }	
	 if (b>0) {
		 System.out.println("Number is not Prime");
		
	} else {
		System.out.println("Number is Prime");

	}


}
 public static void main(String[] args) {
	Assinment3 a3 = new Assinment3();
	a3.prime(97);
	
}
 

}
