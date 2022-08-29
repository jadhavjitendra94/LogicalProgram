package Logical;

public class Palindrome_String {

	public static void main(String[] args) {
		String name="I Love My India";
		char ch;
		String rev="";
		for(int a=name.length()-1;a>=0;a--)
		{
			ch=name.charAt(a);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(name.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
