package basic;

public class Main {

	public static void main(String[] args) {
		// 1. ��ü�� ����
		// 2. ��ü�� �̿��ؼ� ���ϴ� �۾��� �Ѵ�.
//		Triangle t = null; // t�� ��ü�� �ƴ϶�... ��ü�� �Ҵ���� ���� Triangle Ÿ���� null ���� ������ ��ü
		Triangle t = new Triangle();
		t.height = 23;
		t.width = 33;
		t.area();
		
	}

}
