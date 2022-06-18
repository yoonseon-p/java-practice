
public class UsingObject {

	public static void main(String[] args) {
		// Object °´Ã¼ 2°³¸¦ »ý¼º ÇÕ´Ï´Ù.
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.hashCode());
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println(obj1.getClass().getName());
		
		String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
		System.out.println(str);
		
		String name1 = "È«±æµ¿";
		String name2 = "È«±æµ¿";
		System.out.println(name1 + " " + name2);
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		String name3 = "abc d";
		String name4 = "abc "+ "d";
		System.out.println(name3 + " " + name4);
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
		
	}

}
