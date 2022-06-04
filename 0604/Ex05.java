package basic;

import java.util.Scanner;

// 시험점수의 합계, 평균, 최고점, 최저점을 구하는 프로그램 이때 사람수는 키보드 입력을 통해 전달받을것
public class Ex05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		int min=999,max=0;
		
		System.out.println("사람의 수 : ");
		int n = in.nextInt();
		int[] score =new int[n];
		
		System.out.println("시험 점수 ");
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
		
		System.out.printf("총합:%d 평균:%.2f 최고점:%d 최저점:%d\n",sum,(float)sum/score.length,max,min);

	}

}
