package basic;

import java.util.Scanner;

public class Ex02 {
//	public static void hello (String name) {
//		System.out.printf("�ȳ��ϼ��� %s�� �ݰ����ϴ�.\n", name);
//	}
	
	public static String hello (String name) {
		String str = String.format("�ȳ��ϼ��� %s�� �ݰ����ϴ�.\n", name);
		return str;
	}
	
	
	public static void main(String[] args) {
		String name = "������";
		String result = hello(name);
		System.out.println(result);
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ���");
//		String name = in.next();
//		hello(name);
	}
}
