package basic;

public class Pro6 {
	public static void main(String[] args) {
		boolean res = (3 < 2) && (4 > 1);
		System.out.println(res);
		
		res = (3 < 2) && (4 < 1);
		System.out.println(res);
		
		res = (3 < 2) || (4 > 1);
		System.out.println(res);
		
		res = (3 > 2) || (4 < 1);
		System.out.println(res);
	}
}
