package basic;

public class Ex02 {

	public static void main(String[] args) {
		double[] doubleArr = {3.45, 2.82, 3.85, 3.94};
		double sum=0;
		
		for(int i=0; i<doubleArr.length; i++) {
			sum+=doubleArr[i];
		}
		
		double avg=sum/doubleArr.length;
		
		
		//System.out.printf("ÃÑÁ¡ : %.2f\n", sum);
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + avg);
		
	}

}
