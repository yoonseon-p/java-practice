package basic;

import java.util.Scanner;

/*
 * 
 * ���ڸ��߱� ����...
 * 0 ~ 100 ������ �����߿� ��ǻ�Ͱ� ������ ���ڸ� ���� (����)
 * ����ڰ� ���ߴ� ����
 * 50	25 --> �۴�
 * 50	70 --> ũ��
 * �����Դϴ�
 * 
 * ������ ���� ������ ����
 * 
 * while(true) ��ȯ���� �����,
 * ����� �Է��� �޾�
 * ���õ� ���� ���� �Է��� ���� ���ؼ�
 * ������ ��ȯ�� ����
 * �׷��� ������ ���
 * 
 */
public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int com = (int)(Math.random()*101);
		int cnt=0;
		
		while(true) {
			cnt++;
			System.out.println("0 ~ 100 ������ ������ �Է��ϼ��� : ");
			int num = in.nextInt();
			
			if(num < com){
				System.out.println(num + "���� Ů�ϴ�");
			}
			else if(num > com) {
				System.out.println(num + "���� �۽��ϴ�");
			}
			else {
				System.out.println("�����Դϴ�");
				break;
			}
		}
		
		System.out.println(cnt + "������ ������ϴ�");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
