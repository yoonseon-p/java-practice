package basic;

import java.util.Scanner;

public class Pro7 {
	public static void main(String[] args) {
		// ���׿���
		
		Scanner in = new Scanner(System.in);
		System.out.println("����� ���̸� �Է��ϼ���");
		int age = in.nextInt();
		
		String check = (age > 19) ? "����" : "�̼�����";
		
		// System.out.println("����� " + check + " �Դϴ�.");
		System.out.printf("����� %s �Դϴ�.\n", check);
	}
}
