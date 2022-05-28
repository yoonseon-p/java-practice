package basic;

import java.util.Scanner;

/*
 * 
 * 숫자맞추기 게임...
 * 0 ~ 100 까지의 숫자중에 컴퓨터가 임의의 숫자를 선택 (랜덤)
 * 사용자가 맞추는 게임
 * 50	25 --> 작다
 * 50	70 --> 크다
 * 정답입니다
 * 
 * 랜덤한 값을 변수에 저장
 * 
 * while(true) 순환문을 만들고,
 * 사용자 입력을 받아
 * 선택된 값과 내가 입력한 값을 비교해서
 * 맞으면 순환문 종료
 * 그렇지 않으면 계속
 * 
 */
public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int com = (int)(Math.random()*101);
		int cnt=0;
		
		while(true) {
			cnt++;
			System.out.println("0 ~ 100 사이의 정수를 입력하세요 : ");
			int num = in.nextInt();
			
			if(num < com){
				System.out.println(num + "보다 큽니다");
			}
			else if(num > com) {
				System.out.println(num + "보다 작습니다");
			}
			else {
				System.out.println("정답입니다");
				break;
			}
		}
		
		System.out.println(cnt + "번만에 맞췄습니다");
		System.out.println("프로그램을 종료합니다.");

	}

}
