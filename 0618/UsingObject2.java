
public class UsingObject2 {
	// ������
	public static void getObject(Object obj) {
		if(obj instanceof String)
			System.out.println("���ڿ�");
		else if (obj instanceof Integer)
			System.out.println("����");
		else
			System.out.println("���ڿ�,���� �� �� �ƴ�");
	}
	
	public static void main(String[] args) {
		getObject(new String("�ȳ��ϼ���"));
		getObject(100);
		getObject(12.5);
	}
}
