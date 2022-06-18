
public class UsingObject2 {
	// 다형성
	public static void getObject(Object obj) {
		if(obj instanceof String)
			System.out.println("문자열");
		else if (obj instanceof Integer)
			System.out.println("정수");
		else
			System.out.println("문자열,정수 둘 다 아님");
	}
	
	public static void main(String[] args) {
		getObject(new String("안녕하세요"));
		getObject(100);
		getObject(12.5);
	}
}
