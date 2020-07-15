package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2)
	{
		int addNum = num1 + num2 ; 
		return addNum;
	}
	
	public double subtraction(double num1, double num2) {
		double subNum = num1 - num2;
		return subNum;
		
	}

	public static void main(String[] args) {
		
		
		Calculator cal =new Calculator();
		/*
		 * cal.add(50, 600); cal.subtraction(300, 200);
		 */
		System.out.println(cal.add(50, 600));
		//System.out.println(cal.subtraction(300, 100));
		double sub= cal.subtraction(300.50, 100.50);
		System.out.println(sub);
		
		// This On Tests 
	}
}

