package basic;
import java.util.*;
// Ȧ ¦ ����
// ��� 
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n = in.nextInt();
		
		if(n%2==0) {
			System.out.println("¦");
		}
		else {
			System.out.println("Ȧ");
		}
		
		if(n%2==0) {
			System.out.println("2�� ���");
		}
		else if(n%3==0) {
			System.out.println("3�� ���");
		}
		else if(n%5==0) {
			System.out.println("5�� ���");
		}
		else if(n%7==0) {
			System.out.println("7�� ���");
		}
		else {
			System.out.println("2,3,5,7�� ����� �ƴ�");
		}
	}
}
