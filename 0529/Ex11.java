package basic;

import java.util.Scanner;

// 시험점수의 합계 평균 최고점 최저점을 구하는 프로그램을 작성
// 사람의 수와 점수는 키보드로 입력받는다.
public class Ex11 {
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
		
		double avg=(double)sum/score.length;
		
		System.out.printf("합계: %d\n", sum);
		System.out.printf("평균: %.2f\n",avg);
		System.out.printf("최고점: %d\n", max);
		System.out.printf("최저점: %d",min);
		
	}
}
