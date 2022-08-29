package Logical;

public class Duplicate_Number_In_Array {

	public static void main(String[] args) {
		int arr[]= {1,3,2,3,4,5};
		for(int a=0;a<arr.length;a++)
		{
			for(int i=a+1;i<arr.length;i++)
			{
				if(arr[a]==arr[i])
				{
					System.out.println(arr[a]);
				}
			}
		}

	}

}
