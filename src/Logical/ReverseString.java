package Logical;

public class ReverseString {

	public static void main(String[] args) {
		String name="jitendra";
		char ch;
		String rev="";
		System.out.println(name.length());
//		for(int a=7;a>=0;a--)
			for(int a=name.length()-1;a>=0;a--)
		{
			ch=name.charAt(a);
			rev=rev+ch;
		}
System.out.println(rev);

	}

}
