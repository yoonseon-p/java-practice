package basic;
import java.util.Scanner;
public class Pro15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���̵� �Է� : ");
		String id = in.next();
		
		if(id.equals("admin")) {
			System.out.println("��й�ȣ �Է� : ");
			String psw = in.next();
			if(psw.equals("1234")) {
				System.out.println("�α��� ����!!");
			}
			else{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
		}
		else {
			System.out.println("���̵� �����ϴ�");
		}
	}
}
