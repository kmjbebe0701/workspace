class PuppyAdv {
	
	String type;
	String name;
	int age;
	String gender;
	
	public PuppyAdv(String type, String name, int age, String gender) {
		
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;

	}
	

	//0. &&: 논리 곱(and 연산자)
	//0. ||: 논리 합(or 연산자)	
	//1. + - * /
	//비교 메서드 만들기
	boolean equals(PuppyAdv p) {
		if (this.type == p.type && this.name == p.name) {
			return true;

		}
		return false;
	}
		
	
	
}