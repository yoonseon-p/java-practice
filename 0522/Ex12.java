package basic;
import java.util.*;
// ���� ��� ����
public class Ex12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n = in.nextInt();
		
		if(n>0) {
			System.out.println("���");
		}
		else if(n<0) {
			System.out.println("����");
		}
		else {
			System.out.println("0");
		}
	}
}
