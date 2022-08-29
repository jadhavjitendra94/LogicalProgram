package Logical;

public class Count_Digit_in_Numer {

	public static void main(String[] args) {

		int num=1994;
		int rem;
		int count=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
	     	count++;
		}
		System.out.println(count);
			
	}


}
