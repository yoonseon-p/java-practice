package basic;

import java.util.Scanner;

/*
 * 
	�迭�� ����� ������ �Է¹޴´�.. �׸��� �� ��Һ��� ���� �Է¹޾Ƽ� ǥ���ϴµ�
	�� ����� ���� �޸��� �����ϰ� {}�� ���μ� ���
	��)  �迭�� ���� 1 2 3 �̷��� ������� �Է������� �����
	{1,2,3} �̷���..
 * 
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ ũ�� ���� : ");
		int n = in.nextInt();
		
		int[] arr =new int[n];
		
		System.out.println("������ �� ���� : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.print("{");
		for(int i=0; i<arr.length; i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i] + ",");
			}
			else
			{
				System.out.print(arr[i]);
			}
			
		}
		System.out.print("}");
		
	}
}
