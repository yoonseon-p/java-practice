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
		System.out.println("������ �Է��ϼ���");
		int num = in.nextInt();
		System.out.println(number(num));
	}

}
