package test14;

public class ExceptionExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int i = 0;
		while(i<=4) {
			try {
				System.out.println(arr[i]);
				i++;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.out.println("�迭�����ٱ�����");
				break;
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("�۾�����"); //�����ϵ� �����ϵ� �۾� �� �ݵ�� ����
			}
		}
	}

}
