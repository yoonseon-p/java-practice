package basic;
import java.util.*;
//À±³â ÆÇº°
public class Ex13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int n = in.nextInt();
		
		if((n%4==0 && n%100!=0) || n%400 ==0) {
			System.out.println("À±³â");
		}
		else {
			System.out.println("À±³â ¾Æ´Ô");
		}
	}
}
