package basic;
import java.util.*;
/*
 * 구구단
 * 중첩 for문
 */
public class Ex06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("시작값을 입력하세요 : ");
		int start = in.nextInt();
		System.out.println("종료값을 입력하세요 : ");
		int end = in.nextInt();
		
		System.out.println("========== 정방향 ==========\n");
		for(int i = start; i <= end; i++) {
			System.out.println(i +"단\n");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j , i*j);
			}
			System.out.println();
		}
		
		
		System.out.println("========== 역방향 ==========\n");
		for(int i = end; i >= start; i--) {
			System.out.println(i +"단\n");
			for(int j=9; j>=1; j--) {
				System.out.printf("%d * %d = %d\n", i, j , i*j);
			}
			System.out.println();
		}
		
	}
}
