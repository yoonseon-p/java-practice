package basic;

import java.util.Scanner;

/*
 * 
 * 정수를 입력하세요 : 5
 * 양수입니다
 * To be Continue? (y/n) : y
 * 
 * 정수를 입력하세요 : -5
 * 음수입니다
 * To be Continue? (y/n) : n
 * 
 * 프로그램을 종료합니다.
 * 
 */
public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요 :");
			int num = in.nextInt();
		
			if(num > 0) {
				System.out.println("양수");
			}
			else if(num < 0) {
				System.out.println("음수");
			}
			else {
				System.out.println("0");
			}
			
			System.out.println("To be Continue? (y/n) : ");
			String isContinue = in.next();
			
			if(isContinue.equals("y")) {
				continue;
			}
			else {
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
}
