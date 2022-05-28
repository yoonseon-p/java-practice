package basic;

import java.util.Scanner;

public class Ex8 {
	public static boolean check(int hu, int com) {
		if((hu==0 && com==2) ||
				(hu==1 && com==0) || 
				(hu==2 && com==1)) {
			return true;
		}
		else if((com==0 && hu==2) ||
				(com==1 && hu==0) ||
				(com==2 && hu==1)) {
			return false;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("가위 바위 보를 입력하세요 (가위 = 0, 바위 = 1, 보 = 2) : ");
		int hu = in.nextInt();
		int com = (int)(Math.random()*3);
		System.out.println(com);
		
		if(hu - com == 0) {
			System.out.println("무승부");
		}
		else if(check(hu,com)) {
			System.out.println("인간 승리");
		}
		else {
			System.out.println("컴퓨터 승리");
		}
		
		System.out.println("==== end game ====");
	}

}
