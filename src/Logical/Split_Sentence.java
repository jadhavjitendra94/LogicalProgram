package Logical;

public class Split_Sentence {

	public static void main(String[] args) {

		String date="29-8-2022";
		String Splitdate[]=date.split("-");
		for(int a=0;a<Splitdate.length;a++)
		{
			System.out.println(Splitdate[a]);
		}
		
	}

}
