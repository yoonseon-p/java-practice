package basic;
import java.util.*;
/*
 * �հ� ���հ��� �Ǵ��ϰ� ��������� ����� �����ϴ� ���α׷�
 * ������ �Է�
 * 60�� �̻��̸� �հݿ��θ� �˷��ִ� ������ true�� �����ϰ�
 * �����մϴ�. --> ���
 * 
 * �հݿ��θ� �˷��ִ� ������ false�� �����ϰ�
 ** �հ��� ��ܿ� �����ϴ�. --> ���
 *
*/
public class Pro8 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		boolean isSuccess;
	
		isSuccess = (score > 60) ? true : false;
		System.out.println("isSuccess : " + isSuccess);
		
		//1
		System.out.println(isSuccess ? "�հ��� �����մϴ�." : "�հ��� ��ܿ� �����ϴ�.");
			
		//2
		if(isSuccess) {
			System.out.println("�հ��� �����մϴ�.");
		}
		else {
			System.out.println("�հ��� ��ܿ� �����ϴ�.");
		}
		
		//3
		String result = (isSuccess) ? "�հ��� �����մϴ�." : "�հ��� ��ܿ� �����ϴ�.";
		System.out.println(result);
	}
}
