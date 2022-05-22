package basic;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("(VIP, NEW, YOUNG)");
		System.out.println("등급을 입력하세요 : ");
		String memberLevel = in.next();
		String msg;
		
		switch(memberLevel) {
		case "VIP":
			msg = "VIP 고객 혜택 적용";
			break;
		case "NEW":
			msg = "신규 고객 혜택 적용";
			break;
		case "YOUNG":
			msg = "청소년 고객 혜택 적용";
			break;
		default:
			msg = "등급 없음";
			break;
		}
		
		System.out.println(msg);
	}
}
