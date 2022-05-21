package basic;
import java.util.*;
/*
 * 합격 불합격을 판단하고 수험생에게 결과를 통지하는 프로그램
 * 점수를 입력
 * 60점 이상이면 합격여부를 알려주는 변수에 true를 셋팅하고
 * 축하합니다. --> 출력
 * 
 * 합격여부를 알려주는 변수에 false를 셋팅하고
 ** 합격자 명단에 없습니다. --> 출력
 *
*/
public class Pro8 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		boolean isSuccess;
	
		isSuccess = (score > 60) ? true : false;
		System.out.println("isSuccess : " + isSuccess);
		
		//1
		System.out.println(isSuccess ? "합격을 축하합니다." : "합격자 명단에 없습니다.");
			
		//2
		if(isSuccess) {
			System.out.println("합격을 축하합니다.");
		}
		else {
			System.out.println("합격자 명단에 없습니다.");
		}
		
		//3
		String result = (isSuccess) ? "합격을 축하합니다." : "합격자 명단에 없습니다.";
		System.out.println(result);
	}
}
