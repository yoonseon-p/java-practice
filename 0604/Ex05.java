package basic;

import java.util.Scanner;

// ���������� �հ�, ���, �ְ���, �������� ���ϴ� ���α׷� �̶� ������� Ű���� �Է��� ���� ���޹�����
public class Ex05 {
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
		
		System.out.printf("����:%d ���:%.2f �ְ���:%d ������:%d\n",sum,(float)sum/score.length,max,min);

	}

}
