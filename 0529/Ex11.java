package basic;

import java.util.Scanner;

// ���������� �հ� ��� �ְ��� �������� ���ϴ� ���α׷��� �ۼ�
// ����� ���� ������ Ű����� �Է¹޴´�.
public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		int min=999,max=0;
		
		System.out.println("����� �� : ");
		int n = in.nextInt();
		int[] score =new int[n];
		
		System.out.println("���� ���� ");
		for(int i=0; i<score.length; i++) {
			score[i] = in.nextInt();
			sum+=score[i];
			
			if(score[i]>max) {
				max=score[i];
			}
			if(score[i]<min) {
				min=score[i];
			}
			
		}
		
		double avg=(double)sum/score.length;
		
		System.out.printf("�հ�: %d\n", sum);
		System.out.printf("���: %.2f\n",avg);
		System.out.printf("�ְ���: %d\n", max);
		System.out.printf("������: %d",min);
		
	}
}
