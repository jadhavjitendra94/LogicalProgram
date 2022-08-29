package Logical;

public class Addition_of_Number {

	public static void main(String[] args) {
		int num=1994;
        int  rem;
        int sum=0;
		String num1=Integer.toString(num);
		System.out.println(num1.length());
		for(int a=0;a<num1.length();a++)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;	
		}
		System.out.println(sum);

	}

}
