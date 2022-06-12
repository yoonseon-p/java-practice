package basic;

public class HumanMain {

	public static void main(String[] args) {
		Human h = new Human();
		
		if(!h.setName("ȫ�浿"))
			return;
		if(!h.setHeight(180))
			return;
		if(!h.setWeight(120))
			return;
		
		System.out.printf("name = %s , height = %d , weight = %d\n",
				h.getName(), h.getHeight(), h.getWeight());
		
	}

}
