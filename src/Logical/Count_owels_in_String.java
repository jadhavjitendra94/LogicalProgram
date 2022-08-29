package Logical;

public class Count_owels_in_String {

	public static void main(String[] args) {
		String name="jitendra";
		int count=0;
		char ch[]=name.toCharArray();
		for(char c:ch)
		{
			switch(c)
			{
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				count++;
				break;	
			}
		}
		System.out.println(count);
	}

}
