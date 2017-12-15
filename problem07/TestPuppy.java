public class TestPuppy {
	
	public static void main(String[] args) {
		
		PuppyAdv A = 
			new PuppyAdv("진돗개", "에이", 3, "남");
		PuppyAdv B = 
			new PuppyAdv("삽살개", "비", 2, "여");
		PuppyAdv C = 
			new PuppyAdv("진돗개", "에이", 2, "여");	
			
			
		boolean isEqual = A.equals(B);
		System.out.println(isEqual);
		
		boolean isEqual02 = A.equals(C);
		System.out.println(isEqual02);
			
		
	}
	
}