package basic;

import java.util.Scanner;

public class Ex8 {
	public static boolean check(int hu, int com) {
		if((hu==0 && com==2) ||
				(hu==1 && com==0) || 
				(hu==2 && com==1)) {
			return true;
		}
		else if((com==0 && hu==2) ||
				(com==1 && hu==0) ||
				(com==2 && hu==1)) {
			return false;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� ���� ���� �Է��ϼ��� (���� = 0, ���� = 1, �� = 2) : ");
		int hu = in.nextInt();
		int com = (int)(Math.random()*3);
		System.out.println(com);
		
		if(hu - com == 0) {
			System.out.println("���º�");
		}
		else if(check(hu,com)) {
			System.out.println("�ΰ� �¸�");
		}
		else {
			System.out.println("��ǻ�� �¸�");
		}
		
		System.out.println("==== end game ====");
	}

}
