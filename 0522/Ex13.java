package basic;
import java.util.*;
//���� �Ǻ�
public class Ex13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int n = in.nextInt();
		
		if((n%4==0 && n%100!=0) || n%400 ==0) {
			System.out.println("����");
		}
		else {
			System.out.println("���� �ƴ�");
		}
	}
}
