package basic;
import java.util.*;
public class Pro9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("##### �޴� ���� #####");
		System.out.println("[1] ������ [2] �Ǹ���");
		System.out.println("�޴��� �����ϼ��� : ");
		
		// ����Ÿ��
		String seller = in.next();
		
		// ���ڿ��� �񱳴� == ���� �ʰ� equals�� ����Ѵ�.
		if(seller.equals("1")) {
			System.out.println("�����ڷ� �α��� �߽��ϴ�.");
		}
		else {
			System.out.println("�Ǹ��ڷ� �α��� �߽��ϴ�.");
		}
	}
}
