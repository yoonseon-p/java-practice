package basic;
import java.util.Scanner;

/*
 * 1. ���������� �ƴ���
 * 2. �޴� �ΰ��߿� ��� �޴��� �����ϴ���
 * 3. ���
 * ������ + 1�� �޴�
 * ������ + 2�� �޴�
 * ������� + 1�� �޴�
 * ������� + 2�� �޴�
 * 
 */
public class Pro12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���(�����ڴ� admin)");
		String id = in.next();
		
		System.out.println("�޴��� ���� �ϼ���([1] ȸ������ [2] ȸ������ ����)");
		int choice = in.nextInt();
		
		if(id.equals("admin") && choice == 1) {
			System.out.println("admin�� 1�� �޴� ����");
		}
		else if(id.equals("admin") && choice == 2) {
			System.out.println("admin�� 2�� �޴� ����");
		}
		else if(!id.equals("admin") && choice == 2) {
			System.out.println(id + "�� 1�� �޴� ����");
		}
		else{
			System.out.println(id + "�� 2�� �޴� ����");
		}
	}
}
