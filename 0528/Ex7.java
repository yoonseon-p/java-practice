package basic;

import java.util.Scanner;

/*
 * 가위바위보 게임
 * 입력을 받는다..(가위 = 0, 바위 = 1, 보 = 2)
 * 랜덤함수를 이용해서 컴퓨터가 가위 바위 보를 서탠해서
 * 게임결과를 보여준다..
 * 인간승
 * 인간패
 * 비김
 * 
 * 인간O		컴퓨터X
 * 가위		보		
 * 바위		가위	
 * 보		바위	
 * 
 * 인간X		컴퓨터O
 * 가위		바위
 * 바위		보	
 * 보		가위
 * 
 */
public class Ex7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		
		while(true) {
			System.out.println("가위 바위 보를 입력하세요 (가위 = 0, 바위 = 1, 보 = 2) : ");
			int hu = in.nextInt();
			
			// 범위에 벗어난 입력값 재입력 받기
			while(hu>=3) {
				System.out.println("범위에 벗어났습니다 다시 입력하세요 (가위 = 0, 바위 = 1, 보 = 2) :");
				hu = in.nextInt();
			}
			
			// 인간이 선택한 값 출력
			switch(hu) {
			case 0:
				System.out.println("인간 = 가위");
				break;
			case 1:
				System.out.println("인간 = 바위");
				break;
			default:
				System.out.println("인간 = 보");
				break;
			}
			
			int com = (int)(Math.random()*3); // 0 ~ 2
			// 컴퓨터가 가지고 있는 값 출력
			switch(com) {
			case 0:
				System.out.println("컴퓨터 = 가위");
				break;
			case 1:
				System.out.println("컴퓨터 = 바위");
				break;
			default:
				System.out.println("컴퓨터 = 보");
				break;
			}
			
			// 게임 결과 출력
			if((com==0 && hu==2) || (com==1 && hu==0) || (com==2 && hu==1)) {
				System.out.println("컴퓨터 승리");
			}
			else if((hu==0 && com==2) || (hu==1 && com==0) || (hu==2 && com==1)) {
				System.out.println("인간 승리");
			}
			else{
				System.out.println("무승부");
			}
			
			// 게임 종료 여부 확인
			System.out.println("종료 하시겠습니까? (y/n) : ");
			String isContinue = in.next();
			
			if(isContinue.equals("n")) {
				continue;
			}
			else {
				break;
			}
			
		}
		System.out.println("==== end game ====");
	}
}
