public class TestCalc {
	
	public static void main (String[] args) {
		
		Calc a = new Calc ();
	
		
		int q = Integer.parseInt(args[0]);
		int p = Integer.parseInt(args[1]);
	
	
	int result1 = a.add(q, p);
	System.out.println("두 수를 더하면" + result1);
	
	int result2 = a.sub(q, p);
	System.out.println("두 수를 빼면" +result2);
	
	int result3 = a.mul(q, p);
	System.out.println("두 수를 곱하면" +result3);
	
	int result4 = a.div(q, p);
	System.out.println("두 수를 나누면" +result4);
	
	}
	
	

	
}