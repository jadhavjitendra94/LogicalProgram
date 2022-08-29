package Logical;

public class Maximum_Number_in_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,9,12,14};
		int max=arr[0];
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]>max)
			{
				max=arr[a];
			}
		}
		System.out.println(max);
		
		
		
		

	}

}
