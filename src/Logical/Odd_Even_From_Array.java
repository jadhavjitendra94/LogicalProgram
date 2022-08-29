package Logical;

public class Odd_Even_From_Array {

	public static void main(String[] args) {
		int arr[]= {1,9,9,4};
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]%2==0)
			{
				System.out.println(arr[a]);
			}
		}
		System.out.println("======================");
		for(int a=0;a<arr.length;a++)
		if(arr[a]%2!=0)
		{
			System.out.println(arr[a]);
		}

	}

}
