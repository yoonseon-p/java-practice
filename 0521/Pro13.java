package basic;
import java.util.Scanner;
public class Pro13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n1�Է� : ");
		int n1= in.nextInt();
		System.out.println("n2�Է� : ");
		int n2= in.nextInt();
		
		if(n1 > 0 && n2 > 100) {
			System.out.println("n1�� 0 ���� ũ�� n2�� 100���� ũ��.");
		}
		else {
			System.out.println("������ �������� ����");
		}
	}
}
