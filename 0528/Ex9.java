package basic;

import java.util.Scanner;

/*
 * 
 * ������ �Է��ϼ��� : 5
 * ����Դϴ�
 * To be Continue? (y/n) : y
 * 
 * ������ �Է��ϼ��� : -5
 * �����Դϴ�
 * To be Continue? (y/n) : n
 * 
 * ���α׷��� �����մϴ�.
 * 
 */
public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��ϼ��� :");
			int num = in.nextInt();
		
			if(num > 0) {
				System.out.println("���");
			}
			else if(num < 0) {
				System.out.println("����");
			}
			else {
				System.out.println("0");
			}
			
			System.out.println("To be Continue? (y/n) : ");
			String isContinue = in.next();
			
			if(isContinue.equals("y")) {
				continue;
			}
			else {
				break;
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
}
