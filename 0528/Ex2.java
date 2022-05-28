package basic;
import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		// 0~99
		int randomNum = (int)(Math.random()*100);
		while (randomNum < 90) {
			System.out.println(randomNum);
			randomNum = (int)(Math.random()*100);
		}
		System.out.println("--------------------------");
		
		int n=1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요 : ");
		int m = in.nextInt();
		
		while (n <= m) {
			System.out.println(n);
			n++;
		}
		System.out.println("END");
		
		System.out.println("--------------------------");
		
		for(int i=1; i<=m; i++) {
			System.out.println(i);
		}
		System.out.println("END");
		
	}
}
