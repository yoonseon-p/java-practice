package basic;

import java.util.Scanner;

/*
 * 
 * 3자리의 양의 정수(100~999)를 읽는 프로그램을 작성
 * 단 입력한 값이 3자리의 양의 정수가 아니면 다시 입력을 받는다
 * 
 * 사용자로부터 입력을 받는다
 * 값이 100~999 사이에 있는지 체크한다.
 * 범위내에 있으면 입력값 출력
 * 
 * 만약 아니면 다시 입력받는다.
 * 
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("100~999 사이의 정수를 입력하세요 : ");
			int num = in.nextInt();
			
			if(num>=100 && num<=999) {
				System.out.println(num);
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
