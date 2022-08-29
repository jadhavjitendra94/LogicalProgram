package Logical;

import java.util.HashSet;

public class Duplicate_Value {

	public static void main(String[] args) {
		String value[]= {"java","python","java","c"};
		HashSet hs=new HashSet();
		
		for(int a=0;a<value.length;a++)
		{
			hs.add(value[a]);
		}
		System.out.println(hs);
		
	
	}

}
