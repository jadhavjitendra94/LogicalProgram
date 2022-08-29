package Logical;

public class Search_Element_In_Array {

	public static void main(String[] args) {
		String value[]= {"java","python","java","c"};
		String search="c";
		boolean flag=false;
		for(int a=0;a<value.length;a++)
		{
			if(search==value[a])
			{
				System.out.println("found="+ value[a]);
				flag=true;
				break;
				
			}
		}
			if(flag==false)
			{
				System.out.println("not found");
			}
		}
		
	}


