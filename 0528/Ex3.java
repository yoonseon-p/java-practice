package basic;
import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		// for loop 0 ~ 5
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		// 변수 i는 for문 밖에서는 사용 못함
		
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		
		// 변수 i는 while문이 끝나도 살아있다...
		System.out.println(i);
		
	}
}
