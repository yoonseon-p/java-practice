package basic;

import java.util.Scanner;

/*
 * 
 * 3�ڸ��� ���� ����(100~999)�� �д� ���α׷��� �ۼ�
 * �� �Է��� ���� 3�ڸ��� ���� ������ �ƴϸ� �ٽ� �Է��� �޴´�
 * 
 * ����ڷκ��� �Է��� �޴´�
 * ���� 100~999 ���̿� �ִ��� üũ�Ѵ�.
 * �������� ������ �Է°� ���
 * 
 * ���� �ƴϸ� �ٽ� �Է¹޴´�.
 * 
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("100~999 ������ ������ �Է��ϼ��� : ");
			int num = in.nextInt();
			
			if(num>=100 && num<=999) {
				System.out.println(num);
				break;
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
