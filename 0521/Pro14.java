package basic;
import java.util.Scanner;
public class Pro14 {
	public static void main(String[] args) {
		boolean isSuccess = true; // ���� ������ ��Ÿ���� ������ prefix is~~~ �Ѵ�..
		
		String str =" ";
		
		if(isSuccess) {
			str= "����";
		}
		else {
			str= "����";
		}
		System.out.println(str);
		
		// �̷��� if~~ else ���忡�� �ϳ��� �������� ���׿����ڷ� ��ä�� �����ϴ�.
		
		str = (isSuccess) ? "����" : "����";
		System.out.println(str);
	}
}
