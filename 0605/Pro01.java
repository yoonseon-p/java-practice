package basic;
import java.util.*;
/*
 * 
 * Q : 사용자로부터 다음과 같은 형태로 입력받는다.
 * 입력의 예 : 2 + 9
 * 입력은 Scanner를 이용
 * 입력한 데이터는 문자열로 받게된다.
 * 
 */
public class Pro01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 1
		/*
		System.out.println("사칙연산을 공백을 기준으로 입력하세요 (예 2 + 4) : ");
		String input = in.nextLine();
		System.out.println(input);
		input.split(" ");
		String[] datas = input.split(" ");
		*/
		
		// 2
		/*
		System.out.println("사칙연산을 공백없이 입력하세요 (예 2+4) : ");
		String input = in.nextLine();
		System.out.println(input);
		char[] datas = input.toCharArray();
		*/
		
		// 3
		/*
		System.out.println("사칙연산을 공백을 기준으로 입력하세요 (예 2 + 4) : ");
		String input1 = in.next();
		String input2 = in.next();
		String input3 = in.next();
		System.out.println(input1);
		System.out.println(input2);
		System.out.println(input3);
		*/
		
		// 사칙연산 함수를 이용해서 결과를 출력(함수안에서 출력 / 결과를 받아서 main 출력)
		
	}

}
