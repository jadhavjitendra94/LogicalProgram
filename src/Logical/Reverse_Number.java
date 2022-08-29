package Logical;

public class Reverse_Number {

	public static void main(String[] args) {
		int num=1994;
		char ch;
		String rev="";
		String num1=Integer.toString(num);
		System.out.println(num1.length());
		for(int a=num1.length()-1;a>=0;a--)
		{
			ch=num1.charAt(a);
			rev=rev+ch;
			
		}
		System.out.println(rev);
		

	}

}
