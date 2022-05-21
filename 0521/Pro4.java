package basic;

public class Pro4 {
	public static void main(String[] args) {
		System.out.println("Byte max : " + Byte.MAX_VALUE);
		System.out.println("Byte min : " + Byte.MIN_VALUE);
		
		System.out.println("-----------------------------");
		
		Byte res1 = (byte) (127 + 129);
		System.out.println("res1 : " + res1);
		res1 = (byte) (-128 - 128);
		System.out.println("res1 : " + res1);
	}
}
