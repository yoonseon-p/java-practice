package basic;

import java.util.Arrays;
import java.util.Random;

// ������ 5 x 5 ����� �̿��ؼ� ���� ���� -> ��ǻ�� vs ��

public class Ex04 {
	public static void main(String[] args) {
		// ������ ������(0~20) 5���� ���� 1���� �迭�� �����
		// ��հ� ���� �׸��� �ִ밪�� �ּҰ��� ���� ���
	
		// Random Ŭ������ �̿��� ���� ���� ���� Ȯ��
		Random r = new Random();
//		for (int i = 0; i < 5; i++) {
//			System.out.println(r.nextInt(20));	
//		}
//		
		int sum=0;
		int max=0, min=9999;
		
		// 1���� �迭 ���� 5���� ���� 
		int[] ary1th = new int[5];
		for (int i = 0; i < ary1th.length; i++) {
			ary1th[i] = r.nextInt(20);
			
			sum+=ary1th[i];
			
			if(ary1th[i]>max)
				max=ary1th[i];
			if(ary1th[i]<min)
				min=ary1th[i];
		}
		
		System.out.println( Arrays.toString(ary1th));
		System.out.printf("����:%d ���:%.2f �ִ밪:%d �ּҰ�:%d\n",sum,(float)sum/ary1th.length,max,min);
		
		// 5 X 5 �� 2���� �迭�� ���� 0 ~ 20 ���̷� ������ ������ �ʱ�ȭ
		// ��հ� ���� �׸��� �ִ밪�� �ּҰ��� ���غ���
		// �� row�� �հ� ��� �ִ� �ּ�
		// �� col�� �հ� ��� �ִ� �ּ�
		// �밢���� �հ� ��� �ִ� �ּ�
		sum=0; max=0; min=9999; 
		int sum1=0 , sum2=0;
		
		int[][] ary2th = new int[5][5];
		for(int i=0; i<ary2th.length; i ++) {
			for(int j=0; j<ary2th[i].length; j++) {
				ary2th[i][j] = r.nextInt(20);
				
				sum+=ary2th[i][j];
				
				if(ary2th[i][j]>max)
					max=ary2th[i][j];
				if(ary2th[i][j]<min)
					min=ary2th[i][j];
			}
		}
		
		for (int i = 0; i < ary2th.length; i++) {
			sum1+=ary2th[i][i];
		}
		
		for (int i = 0; i < ary2th.length; i++) {
			sum2+=ary2th[i][ary2th.length-1-i];
		}
		
		
	}
}
