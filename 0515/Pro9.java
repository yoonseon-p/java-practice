package basic;
import java.util.*;

public class Pro9 {
	// Ŭ������ ��Ͽ��� ����Ǿ��� ������ Ŭ���� �����̰�.. Ŭ���� ����
	// �Ǵ� �ν��Ͻ� ����(instance variable)
	int num1;
	
	//main �Լ�(�޼ҵ�)�ȿ��� ������ ������ Ŭ�������忡����
	// �� ���������̴�.
	
	public static void main(String[] args) {
		int n1 = 10; // �������� global variable
		System.out.println(n1);
		
		//������ ������ ���� �������� �������.
		// �������ٴ� --> ������ �� �Ǿ���.. �� ��������.
		
		{
			System.out.println(n1);
			int n2=20; // �������� local variable
			System.out.println(n2);
		}
		
		//System.out.println(n2);
	}
}
