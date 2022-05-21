package basic;
import java.util.Scanner;
public class Pro14 {
	public static void main(String[] args) {
		boolean isSuccess = true; // 참과 거짓을 나타내는 변수는 prefix is~~~ 한다..
		
		String str =" ";
		
		if(isSuccess) {
			str= "성공";
		}
		else {
			str= "실패";
		}
		System.out.println(str);
		
		// 이렇게 if~~ else 문장에서 하나씩 있을때는 삼항연산자로 대채가 가능하다.
		
		str = (isSuccess) ? "성공" : "실패";
		System.out.println(str);
	}
}
