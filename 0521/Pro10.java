package basic;
import java.util.Scanner;
public class Pro10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("## 로그인(admin 혹은 임의 아이디) ##");
		System.out.println("# 로그인 아이디 : ");
		
		String user = in.next();
		
		if(user.equals("admin")) {
			System.out.println("관리자 로그인!!");
		}
		else {
			System.out.println(user + " 로그인!!");
		}
		
		System.out.println("## 메뉴를 선택 하세요(1~2) ##");
		System.out.println("# 메뉴 선택 : ");
			
		String sel = in.next();
			
		if(sel.equals("1") && user.equals("admin")) {
			System.out.println("관리자 1번 선택함!!");
		}
		else if(sel.equals("2") && user.equals("admin")) {
			System.out.println("관리자 2번 선택함!!");
		}
		else if(sel.equals("1") && !user.equals("admin")) {
			System.out.println(user + " 1번 선택함!!");
		}	
		else if(sel.equals("2") && !user.equals("admin")) {
			System.out.println(user + " 2번 선택함!!");
		}
	}
}
