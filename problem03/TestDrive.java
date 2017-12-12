public class TestDrive {
	
	// 프로그램의 시작점
	public static void main(String[] args) {

		// 객체 (Object): yeEun, sangIl, sangHoon
		Student miji = 
			new Student(20122042, "김미지", 25, "반도체 전자", 2);
			
		Student miji2 = 
			new Student(20112042, "김미지2", 26, "화학", 3);	
			
		Student miji3 = 
			new Student(20102042, "김미지3", 27, "전기", 4);	



		// 
		miji.study();

		// 
		miji.introduce();
		
		// 
		miji2.study();

		// 
		miji2.introduce();		
		
		// 
		miji3.study();

		// 
		miji3.introduce();		
		
	}
}