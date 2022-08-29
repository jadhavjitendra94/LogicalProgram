package Logical;

public class FindOccurance_In_String {

	public static void main(String[] args) {
		String name="jitendrajadhav";
		System.out.println(name.length()-name.replaceAll("[a,e,i,o,u]", "").length());
		

	}

}
