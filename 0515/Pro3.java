package basic;

public class Pro3 {
	public static void main(String[] args) {
		// type casting (�� ��ȯ)
		int n1 = 100, n2 = 200;
		// ���ڿ� + ���Ÿ�� ---> ���ڿ� + ���ڿ�
		System.out.println("���ϱ� : " + (n1+n2));
		System.out.println("���� : " + (n1-n2));
		System.out.println("���ϱ� : " + (n1*n2));
		
		// ���� / ������ ����� �����̱� ������
		// �Ǽ� / �Ǽ� ���·� ������ ��� �Ѵ�
		// type ��ȯ�� ������ �տ� (Ÿ��)�� �����ش�
		System.out.println("������ : " + ((double)n1/n2));
		
		/*
		System.out.println((n1));
		System.out.println(((double)n1));
		System.out.println("������ : " + ((double)n1/(double)n2));
		*/
	}
}
