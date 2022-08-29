package Logical;

public class Count_Repeated_letter_in_String {

	public static void main(String[] args) {
		String name="Hello";
		for(int a=0;a<name.length();a++)
		{
			for(int b=a+1;b<name.length();b++)
			{
				if(name.charAt(a)==name.charAt(b))
						{
					System.out.println(name.charAt(a));
						}
			}
		}
		

	}

}
