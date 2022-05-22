package basic;
import java.util.*;
// 숙제2
public class Pro2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("시작값을 입력하세요 : ");
		int start = in.nextInt();
		System.out.println("종료값을 입력하세요 : ");
		int end = in.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=start; j<=end; j++) {
				System.out.printf("%d * %d = %d\t",j,i,(j*i));
			}
			System.out.println();
		}
	}
}
