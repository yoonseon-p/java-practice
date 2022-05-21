package basic;
import java.util.*;
public class Pro9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("##### 메뉴 선택 #####");
		System.out.println("[1] 구매자 [2] 판매자");
		System.out.println("메뉴를 선택하세요 : ");
		
		// 참조타입
		String seller = in.next();
		
		// 문자열의 비교는 == 쓰지 않고 equals를 사용한다.
		if(seller.equals("1")) {
			System.out.println("구매자로 로그인 했습니다.");
		}
		else {
			System.out.println("판매자로 로그인 했습니다.");
		}
	}
}
