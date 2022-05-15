package basic;
import java.util.*;

public class Pro9 {
	// 클래스의 블록에서 선언되었기 때문에 클래스 소유이고.. 클래스 변수
	// 또는 인스턴스 변수(instance variable)
	int num1;
	
	//main 함수(메소드)안에서 생성된 변수는 클래스입장에서는
	// 다 지역변수이다.
	
	public static void main(String[] args) {
		int n1 = 10; // 전역변수 global variable
		System.out.println(n1);
		
		//변수는 생성된 블럭이 없어지면 사라진다.
		// 없어진다는 --> 실행이 다 되었다.. 다 지나갔다.
		
		{
			System.out.println(n1);
			int n2=20; // 지역변수 local variable
			System.out.println(n2);
		}
		
		//System.out.println(n2);
	}
}
