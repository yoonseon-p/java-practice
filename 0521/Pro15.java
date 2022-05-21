package basic;
import java.util.Scanner;
public class Pro15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = in.next();
		
		if(id.equals("admin")) {
			System.out.println("비밀번호 입력 : ");
			String psw = in.next();
			if(psw.equals("1234")) {
				System.out.println("로그인 성공!!");
			}
			else{
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
		else {
			System.out.println("아이디가 없습니다");
		}
	}
}
