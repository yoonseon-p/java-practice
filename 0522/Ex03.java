package basic;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("(VIP, NEW, YOUNG)");
		System.out.println("����� �Է��ϼ��� : ");
		String memberLevel = in.next();
		String msg;
		
		switch(memberLevel) {
		case "VIP":
			msg = "VIP �� ���� ����";
			break;
		case "NEW":
			msg = "�ű� �� ���� ����";
			break;
		case "YOUNG":
			msg = "û�ҳ� �� ���� ����";
			break;
		default:
			msg = "��� ����";
			break;
		}
		
		System.out.println(msg);
	}
}
