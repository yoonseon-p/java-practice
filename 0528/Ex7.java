package basic;

import java.util.Scanner;

/*
 * ���������� ����
 * �Է��� �޴´�..(���� = 0, ���� = 1, �� = 2)
 * �����Լ��� �̿��ؼ� ��ǻ�Ͱ� ���� ���� ���� �����ؼ�
 * ���Ӱ���� �����ش�..
 * �ΰ���
 * �ΰ���
 * ���
 * 
 * �ΰ�O		��ǻ��X
 * ����		��		
 * ����		����	
 * ��		����	
 * 
 * �ΰ�X		��ǻ��O
 * ����		����
 * ����		��	
 * ��		����
 * 
 */
public class Ex7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� ���� �� ����");
		
		while(true) {
			System.out.println("���� ���� ���� �Է��ϼ��� (���� = 0, ���� = 1, �� = 2) : ");
			int hu = in.nextInt();
			
			// ������ ��� �Է°� ���Է� �ޱ�
			while(hu>=3) {
				System.out.println("������ ������ϴ� �ٽ� �Է��ϼ��� (���� = 0, ���� = 1, �� = 2) :");
				hu = in.nextInt();
			}
			
			// �ΰ��� ������ �� ���
			switch(hu) {
			case 0:
				System.out.println("�ΰ� = ����");
				break;
			case 1:
				System.out.println("�ΰ� = ����");
				break;
			default:
				System.out.println("�ΰ� = ��");
				break;
			}
			
			int com = (int)(Math.random()*3); // 0 ~ 2
			// ��ǻ�Ͱ� ������ �ִ� �� ���
			switch(com) {
			case 0:
				System.out.println("��ǻ�� = ����");
				break;
			case 1:
				System.out.println("��ǻ�� = ����");
				break;
			default:
				System.out.println("��ǻ�� = ��");
				break;
			}
			
			// ���� ��� ���
			if((com==0 && hu==2) || (com==1 && hu==0) || (com==2 && hu==1)) {
				System.out.println("��ǻ�� �¸�");
			}
			else if((hu==0 && com==2) || (hu==1 && com==0) || (hu==2 && com==1)) {
				System.out.println("�ΰ� �¸�");
			}
			else{
				System.out.println("���º�");
			}
			
			// ���� ���� ���� Ȯ��
			System.out.println("���� �Ͻðڽ��ϱ�? (y/n) : ");
			String isContinue = in.next();
			
			if(isContinue.equals("n")) {
				continue;
			}
			else {
				break;
			}
			
		}
		System.out.println("==== end game ====");
	}
}
