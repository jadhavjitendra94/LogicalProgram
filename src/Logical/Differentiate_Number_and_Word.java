package Logical;

public class Differentiate_Number_and_Word {

	public static void main(String[] args) {
		String name="jitendra859192jadhav8163";
		String num="";
		String word="";
		for(int a=0;a<name.length();a++)
		{
			if(Character.isDigit(name.charAt(a)))
			{
				num=num+name.charAt(a);
				
			}
			else
			{
				word=word+name.charAt(a);
			}
			
		}
		System.out.println(num);
		System.out.println(word);

	}

}
