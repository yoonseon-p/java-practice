package basic;

public class Ex4 {
		public static void main(String[] args) {
		countdown(5);  // ī��Ʈ�ٿ� �޼ҵ� ȣ��
		}
	
	public static void countdown(int num) {
		System.out.println("ī��Ʈ�ٿ��� �����մϴ�");
		
		while(num>=0) {
			System.out.printf("%d..\n",num);
			num--;
		}
		System.out.println("�߻�!!");
	}
}
