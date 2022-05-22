package basic;
import java.util.Scanner;
public class Pro15 {
	public static void main(String[] args) {
		// 사용자의 입력을 받아들이기 위한 Scanner 클래의 객체(Object)를 생성하고 할당 받음
		Scanner in = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = in.next();			// console에 사용자가 입력하기를 대기하는 명령어, 사용자로부터 입력받은 문자를 id에 저장
		
		if(id.equals("admin")) {				// id라는 변수에 저장된 문자열과 "admin" 문자열이 갗은지 비교하는 구문
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
