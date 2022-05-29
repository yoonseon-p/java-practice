package basic;

import java.util.Scanner;

/*
 * 
	배열의 요소의 개수를 입력받는다.. 그리고 각 요소별로 값을 입력받아서 표시하는데
	각 요소의 값을 콤마로 구분하고 {}로 감싸서 출력
	예)  배열의 값을 1 2 3 이렇게 순서대로 입력했으면 출력은
	{1,2,3} 이렇게..
 * 
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("베열의 크기 지정 : ");
		int n = in.nextInt();
		
		int[] arr =new int[n];
		
		System.out.println("베열의 값 지정 : ");
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
