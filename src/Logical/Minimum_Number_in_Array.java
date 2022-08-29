package Logical;

public class Minimum_Number_in_Array {

	public static void main(String[] args) {
		int arr[]= {1,3,6,8,3,4,0,6};
		int min=arr[0];
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]<min)
			{
				min=arr[a];
			}
		}
		System.out.println(min);

	}

}
