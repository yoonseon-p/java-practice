package basic;

public class Human2 {
	private String name, address;
	private int age,weight,height;
	
	// �⺻������.. hidden
	public Human2(){
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�");
	}
	
	// �Ű������� �ִ� ������
	public Human2(String name, String address,int age,int weight,int height){
		this.name = name;
		this.address = address;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Human2 [name=" + name + ", address=" + address + ", age=" + age + ", weight=" + weight + ", height="
				+ height + "]";
	}

	public void allSettings(String name, String address,int age,int weight,int height) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// Alt+Shift+s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
