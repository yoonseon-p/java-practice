package basic;

import java.util.Scanner;

public class Pro11 {
	public static void main(String[] args) {
		System.out.println("���� ���� ���� ������ ������ �������� �Է��ϼ���");
		//80 90 80 83.333...
		
		Scanner in = new Scanner(System.in);
		
		int kor= in.nextInt();
		int eng= in.nextInt();
		int math= in.nextInt();
		// ���� + ���� +������ ����� ����
		// ���� / ���� ��� ����
			
		double avg =((double)kor+eng+math) / 3;
		//double avg =(kor+eng+math) / 3.0;
		//���� -- double avg =((double)kor+(double)eng+(double)math) / (double)3;
		System.out.println("��� ���� : " + avg);
	}
}
