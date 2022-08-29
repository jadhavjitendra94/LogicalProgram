package Logical;

public class Prime_Number {

	public static void main(String[] args) {
		int num=11;
		int count=0;
		if(num>1);
		{
		for(int a=1;a<=num;a++)
		{
			if(num%a==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("not prime");
		}
		}
	}
}
		

	
