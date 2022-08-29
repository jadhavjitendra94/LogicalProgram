package Logical;

public class Duplicate_Number2 {

	public static void main(String[] args) {

		String value[]= {"java","python","java","c"};
		for(int a=0;a<value.length;a++)
		{
			for(int b=a+1;b<value.length;b++)
			{
				if(value[a]==value[b])
				{
					System.out.println(value[a]);
				}
			}
		}
	}

}
