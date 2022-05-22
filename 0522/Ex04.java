package basic;
import java.util.*;
/*
 * 숫자 2개를 입력 받아서 .. ex) 1 5
 * 1~5까지의 합을 구하세요
 * 입력 받아 출력하기 3번 반복
 * 
 */
public class Ex04 {
	public static void main(String[] args) {
		for(int k=0; k<3; k++) {
			Scanner in = new Scanner(System.in);
			System.out.println("시작값을 입력하세요 : ");
			int start = in.nextInt();
			System.out.println("종료값을 입력하세요 : ");
			int end = in.nextInt();
			// 합계를 저장할 변수
			int sum=0;
			
			for(int i=start; i<=end; i++) { // start ~ end
				sum+=i;
			}
			
			System.out.printf("%d부터 %d까지의 합 = %d\n",start, end, sum);
			System.out.println("===================");
		}
		
	}
}
