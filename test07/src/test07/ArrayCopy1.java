package test07;

public class ArrayCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,45,5,74,8,96,1};
		int[] arr2 = {6,5,78,8,5,23,4};
		int[] arr3 = {6,5,78,8,5,23,4};
		System.out.println(arr1);
		System.out.println(arr2);
		arr2 = arr1;
		System.out.println(arr1);
		System.out.println(arr2);
		System.arraycopy(arr1,0,arr3,1,6);
		System.out.println(arr2);
	}

}
