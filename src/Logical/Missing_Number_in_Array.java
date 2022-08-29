package Logical;

public class Missing_Number_in_Array {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,6,7};
		int sum=0;
		int sum1=0;
		for(int a=0;a<arr.length;a++)
		{
			sum=sum+arr[a];	
		}
		System.out.println(sum);
		for(int a=0;a<=7;a++)
		{
			sum1=sum1+a;
	
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
		
	}

}
