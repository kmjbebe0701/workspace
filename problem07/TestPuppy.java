public class TestPuppy {
	
	public static void main(String[] args) {
		
		Puppy A = 
			new Puppy("진돗개", "에이", 3, "남");
		Puppy B = 
			new Puppy("삽살개", "비", 2, "여");
			
			
		boolean isEqual = A.equals(B);
		System.out.println(isEqual);
			
		
	}
	
}