package basic;

public class Ex01 {

	public static void main(String[] args) {
		Calc c =new Calc();	// c�� CalcŬ������ ��ü�����̰� ���� �Ҵ� ����
		c.res = 10;	        // ��ü�� ������ ���� res�� ���� �Ҵ�
		int res = c.add(100); // ��ü�� ������ �޼ҵ带 ȣ��
		System.out.println(res);
		
		Calc c2 = null;
		System.out.println(c2);
		
		int a= 0;
		System.out.println(a);
		
		// �⺻����, ��������(��ü) �ʱ�ȭ �ؾ��Ѵ�
		// ���� ������ �⺻���� null
		// �⺻������ �⺻���� �� Ÿ�Կ� �´� �⺻��... 0, 0.0, false
		// -- ���� Ŭ�����ȿ��� ������ ����(�������� ����)�� �⺻���� ���� �ʾƵ� �ڵ� ����
		
		
		Calc c3 = new Calc();
		
		
	}

}
