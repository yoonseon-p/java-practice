package basic;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// in은 Scanner 객체
		String[] day = {"월", "화", "수", "목", "금"};
		int sum=0;
		int min=999, mind=0;
		int max=0, maxd=0;
		
		int[] sales =new int[5];
		for(int i=0; i<sales.length; i++) {
			System.out.println(day[i] +"요일 판매량 기록 : ");
			int n = in.nextInt();
			sales[i]=n;
			
			// 총 판매량
			sum+=sales[i];
			
			// 가장 많이 팔린 요일
			if(sales[i]>max) {
				max=sales[i];
				maxd=i;
			}
			
			// 가장 적게 팔린 요일
			if(sales[i]<min) {
				min=sales[i];
				mind=i;
			}
		}
		
		System.out.printf("총 판매량 : %d잔\n", sum);
		System.out.printf("가장 많이 판매한 날 : %s요일 (%d잔)\n", day[maxd],max);
		System.out.printf("가장 적게 판매한 날 : %s요일 (%d잔)\n", day[mind],min);
		
	}

}
