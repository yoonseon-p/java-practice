package basic;
import java.util.Scanner;

/*
 * 1. 관리자인지 아닌지
 * 2. 메뉴 두개중에 어느 메뉴를 선택하는지
 * 3. 결과
 * 관리자 + 1번 메뉴
 * 관리자 + 2번 메뉴
 * 비관리자 + 1번 메뉴
 * 비관리자 + 2번 메뉴
 * 
 */
public class Pro12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요(관리자는 admin)");
		String id = in.next();
		
		System.out.println("메뉴를 선택 하세요([1] 회원가입 [2] 회원정보 수정)");
		int choice = in.nextInt();
		
		if(id.equals("admin") && choice == 1) {
			System.out.println("admin이 1번 메뉴 선택");
		}
		else if(id.equals("admin") && choice == 2) {
			System.out.println("admin이 2번 메뉴 선택");
		}
		else if(!id.equals("admin") && choice == 2) {
			System.out.println(id + "가 1번 메뉴 선택");
		}
		else{
			System.out.println(id + "가 2번 메뉴 선택");
		}
	}
}
