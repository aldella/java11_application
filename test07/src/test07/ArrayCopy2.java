package test07;

public class ArrayCopy2 {
	public static void main(String args[]) {
	int[] arr1 = {3,45,5,74,8,96,1};
	int[] arr2 = {6,5,78,8,5,23,4};
	int[] arr3 = {6,5,78,8,5,23,4};
	System.out.println(arr1);
	System.out.println(arr2);
	System.out.println(arr3);
	for(int i=0; i<arr1.length; i++)
	{
		arr3[i]=arr1[i];
	}
	System.out.println(arr3);
	for(int i : arr3)
	{
		System.out.printf("%d ",i);
	}
}
}