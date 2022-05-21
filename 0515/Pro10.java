package basic;
import java.util.*;

public class Pro10 {
	public static void main(String[] args) {
		// 사용자로부터 값을 입력받는 명령어
		Scanner in = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		
		int age = in.nextInt();
		System.out.println("입력한 나이는 : " + age);
		
		//결과가 true,false로 나옴
		System.out.println(age > 25);
		System.out.println((age>=10) && (age<=19));
		System.out.println(age < 10);
		
		//if문
		if(age>=10 && age<=19) {
			System.out.println("10대");
		}
		
	}
}
