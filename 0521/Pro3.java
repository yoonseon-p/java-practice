package basic;

public class Pro3 {
	public static void main(String[] args) {
		System.out.println("int max : " + Integer.MAX_VALUE);
		System.out.println("int min : " + Integer.MIN_VALUE);
		
		System.out.println("-----------------------------");
		
		int res1 = 2147483647 + 1;
		System.out.println("res1 : " + res1);
		res1 = -2147483648 - 1;
		System.out.println("res1 : " + res1);
	}
}
