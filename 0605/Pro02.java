package basic;

import java.util.Scanner;

public class Pro02 {
	
	public static int number (int num) {
		if(num>0) 
			return 1; 
		else if (num == 0)
			return 0;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = in.nextInt();
		System.out.println(number(num));
	}

}
