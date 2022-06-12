package basic;

public class Human2Main {

	public static void main(String[] args) {
		// 1. È«±æµ¿, Á¶¼±ÆÈµµ, 100, 190, 120
		// 2. ±è»ñ°«, Á¶¼±ÆÈµµ, 50, 160, 50
		
		// °¢°¢ÀÇ °´Ã¼°¡ °¡Áö´Â ¸ðµç ¸â¹öº¯¼öÀÇ ³»¿ëÀ» Ãâ·Â
		// »ý¼ºÀÚ - constructor == °´Ã¼¸¦ ¸¸µé¶§ ÀÚµ¿À¸·Î È£ÃâµÇ´Â ÇÔ¼ö(¸Þ¼Òµå) - ±âº»Àº hidden
		
		Human2 h1 = new Human2("È«±æµ¿", "Á¶¼±ÆÈµµ", 100, 190, 120);
		System.out.println(h1.toString());
		
		
		
		
		
		
		
		
		
/*
		Human2 h1 = new Human2();
		h1.allSettings("È«±æµ¿", "Á¶¼±ÆÈµµ", 100, 190, 120);
		
		Human2 h2 = new Human2();
		h2.allSettings("±è»ñ°«", "Á¶¼±ÆÈµµ", 50, 160, 50);
*/

/*
		Human2 h1 = new Human2();
		h1.setName("È«±æµ¿");
		h1.setAddress("Á¶¼±ÆÈµµ");
		h1.setAge(100);
		h1.setHeight(190);
		h1.setWeight(120);
	
		Human2 h2 = new Human2();
		h2.setName("±è»ñ°«");
		h2.setAddress("Á¶¼±ÆÈµµ");
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
