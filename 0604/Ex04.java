package basic;

import java.util.Arrays;
import java.util.Random;

// 숙제는 5 x 5 행렬을 이용해서 빙고 게임 -> 컴퓨터 vs 나

public class Ex04 {
	public static void main(String[] args) {
		// 임이의 정수값(0~20) 5개를 갖는 1차원 배열을 만들고
		// 평균과 총합 그리고 최대값과 최소값을 구해 출력
	
		// Random 클래스를 이용한 난수 생성 사용법 확인
		Random r = new Random();
//		for (int i = 0; i < 5; i++) {
//			System.out.println(r.nextInt(20));	
//		}
//		
		int sum=0;
		int max=0, min=9999;
		
		// 1차원 배열 생성 5개를 갖는 
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
		System.out.printf("총합:%d 평균:%.2f 최대값:%d 최소값:%d\n",sum,(float)sum/ary1th.length,max,min);
		
		// 5 X 5 의 2차원 배열을 만들어서 0 ~ 20 사이로 임의의 정수로 초기화
		// 평균과 총합 그리고 최대값과 최소값을 구해보고
		// 각 row의 합과 평균 최대 최소
		// 각 col의 합과 평균 최대 최소
		// 대각선의 합과 평균 최대 최소
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
