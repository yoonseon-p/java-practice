/*
 * �������� �ִ� ����
 * 1. ��ü�� �θ�Ÿ���� ��ü�� ǥ���Ҽ��־ ���� �ڽ� ��ü���� �θ�Ÿ�� �ϳ��� ���� ��
 * 2. �̷��� �� �θ�Ÿ������ ��� ��ü�� �� �θ�� �ڽ��� 
 */
public class AnimalManage {

	public static void main(String[] args) {
		// �������� ����̸� �迭�� �����ϰ� �ʹ�.
		
		Animal[] animal = {
				new Cat(),new Dog(),new Cat(),new Dog()
		};
		
		for (Animal ani : animal) { // �б� ����
			ani.show();
		}
		
	}

}
