package basic;
/*
 * 
 * ���� ���� �ܼ��� ����
 * ��Ģ���� �� �����ڴ� �ΰ��� ���� + - * / 
 * 1,"+",1 --> 1+1
 * 
 * (int num1, String op, int num2)
 * 
 */
public class Ex04 {
	public static double calc (int num1, String op, int num2){
		int res = 0;
		switch (op) {
		case "+":
			res =  num1 + num2;
			break;
		case "-":
			res =  num1 - num2;
			break;
		case "*":
			res =  num1 * num2;
			break;
		case "/":
			res = num1 / num2;
			break;
		default:
			break;
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String op = "+";
		// �Լ��̸�(num1, op, num2);
		// �Լ����� ��� �� ������ �Ǵ� ����� �����ؼ� ���⼭ ����� ���
		double res=calc(num1,op,num2);
		System.out.printf("%d %s %d = %.2f",num1,op,num2,res);
	}

}
