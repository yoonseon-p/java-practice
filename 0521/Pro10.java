package basic;
import java.util.Scanner;
public class Pro10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("## �α���(admin Ȥ�� ���� ���̵�) ##");
		System.out.println("# �α��� ���̵� : ");
		
		String user = in.next();
		
		if(user.equals("admin")) {
			System.out.println("������ �α���!!");
			
			System.out.println("## �޴��� ���� �ϼ���(1~2) ##");
			System.out.println("# �޴� ���� : ");
			
			String sel = in.next();
			
			if(sel.equals("1") && user.equals("admin")) {
				System.out.println("������ 1�� ������!!");
			}
			else if(sel.equals("2") && user.equals("admin")) {
				System.out.println("������ 2�� ������!!");
			}
			
		}
		else {
			System.out.println(user + " �α���!!");
		}
		
	}
}
