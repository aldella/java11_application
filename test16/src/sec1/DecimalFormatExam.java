package sec1;

import java.text.DecimalFormat;

public class DecimalFormatExam {
//DecimalFormat : ������ ǥ�������� �����Ͽ� Ȱ���ϴ� Ŭ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ǥ������ �ڵ� : 0, #
		//������ �Ȱ���
		//, -> õ ���� ���б�ȣ,   E -> ���� ���·� ǥ��   % -> ����� ǥ��
		//-1234�� ���
		//#E0 : 1.234E+03
		//#% : -123400%
		double a = -1234567.89;
		DecimalFormat df = new DecimalFormat("####################");
//		DecimalFormat df = new DecimalFormat("0;\\ #,##0;-\\ #,##0"); <- ������ �̰� �� �ƴµ� (0�϶�, ����϶�, �����϶�) ������ �� ��. �����ݷ��� ����� �� ���ٴ� �̾߱�
		String res = df.format(a);
		System.out.println(res);
	}

}
