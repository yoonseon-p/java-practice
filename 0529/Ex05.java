package basic;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// in�� Scanner ��ü
		String[] day = {"��", "ȭ", "��", "��", "��"};
		int sum=0;
		int min=999, mind=0;
		int max=0, maxd=0;
		
		int[] sales =new int[5];
		for(int i=0; i<sales.length; i++) {
			System.out.println(day[i] +"���� �Ǹŷ� ��� : ");
			int n = in.nextInt();
			sales[i]=n;
			
			// �� �Ǹŷ�
			sum+=sales[i];
			
			// ���� ���� �ȸ� ����
			if(sales[i]>max) {
				max=sales[i];
				maxd=i;
			}
			
			// ���� ���� �ȸ� ����
			if(sales[i]<min) {
				min=sales[i];
				mind=i;
			}
		}
		
		System.out.printf("�� �Ǹŷ� : %d��\n", sum);
		System.out.printf("���� ���� �Ǹ��� �� : %s���� (%d��)\n", day[maxd],max);
		System.out.printf("���� ���� �Ǹ��� �� : %s���� (%d��)\n", day[mind],min);
		
	}

}
