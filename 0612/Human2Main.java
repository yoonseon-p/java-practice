package basic;

public class Human2Main {

	public static void main(String[] args) {
		// 1. ȫ�浿, �����ȵ�, 100, 190, 120
		// 2. ���, �����ȵ�, 50, 160, 50
		
		// ������ ��ü�� ������ ��� ��������� ������ ���
		// ������ - constructor == ��ü�� ���鶧 �ڵ����� ȣ��Ǵ� �Լ�(�޼ҵ�) - �⺻�� hidden
		
		Human2 h1 = new Human2("ȫ�浿", "�����ȵ�", 100, 190, 120);
		System.out.println(h1.toString());
		
		
		
		
		
		
		
		
		
/*
		Human2 h1 = new Human2();
		h1.allSettings("ȫ�浿", "�����ȵ�", 100, 190, 120);
		
		Human2 h2 = new Human2();
		h2.allSettings("���", "�����ȵ�", 50, 160, 50);
*/

/*
		Human2 h1 = new Human2();
		h1.setName("ȫ�浿");
		h1.setAddress("�����ȵ�");
		h1.setAge(100);
		h1.setHeight(190);
		h1.setWeight(120);
	
		Human2 h2 = new Human2();
		h2.setName("���");
		h2.setAddress("�����ȵ�");
		h2.setAge(50);
		h2.setHeight(160);
		h2.setWeight(50);
		
		System.out.printf("name = %s , dddress = %s , age = %d , height = %d , weight = %d\n",
				h1.getName(), h1.getAddress(), h1.getAge(), h1.getHeight(), h1.getWeight());
		System.out.printf("name = %s , dddress = %s , age = %d , height = %d , weight = %d\n",
				h2.getName(), h2.getAddress(), h2.getAge(), h2.getHeight(), h2.getWeight());
*/
	}

}
