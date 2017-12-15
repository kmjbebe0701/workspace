public class TestCalc {
	
	public static void main (String[] args) {
		
		Calc a = new Calc ();
	
		
	
	
	int result1 = a.add(5, 7);
	System.out.println("두 수를 더하면" + result1);
	
	int result2 = a.sub(2, 1);
	System.out.println("두 수를 빼면" +result2);
	
	int result3 = a.mul(3, 2);
	System.out.println("두 수를 곱하면" +result3);
	
	int result4 = a.div(4, 2);
	System.out.println("두 수를 나누면" +result4);
	
	}
	
	

	
}