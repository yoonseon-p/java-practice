package basic;
import java.util.*;

public class Pro10 {
	public static void main(String[] args) {
		// ����ڷκ��� ���� �Է¹޴� ��ɾ�
		Scanner in = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���");
		
		int age = in.nextInt();
		System.out.println("�Է��� ���̴� : " + age);
		
		//����� true,false�� ����
		System.out.println(age > 25);
		System.out.println((age>=10) && (age<=19));
		System.out.println(age < 10);
		
		//for��
		if(age>=10 && age<=19) {
			System.out.println("10��");
		}
		
	}
}
