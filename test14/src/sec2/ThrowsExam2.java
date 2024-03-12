package sec2;

public class ThrowsExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		int[] arr = new int[3];
		String data = "ty";
		gyogyogyo(name);
		gogogogogog(arr);
	}
	
	public static void gyogyogyo(String data) throws NullPointerException{
		System.out.println(data);
	}
	public static void gogogogogog(int[] arr) throws ArrayIndexOutOfBoundsException {
		for(int i = 0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}

}
