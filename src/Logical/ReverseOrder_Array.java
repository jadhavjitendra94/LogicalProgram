package Logical;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOrder_Array {

	public static void main(String[] args) {
		Integer arr[]= {2,12,3,4,65,74,33};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
