class Student {
	int studentID;	// 학번 	(숫자)
	String name;	// 이름     (문자)
	int age;		// 나이     (숫자)
	String major;	// 전공     (문자)
	int grade;		// 학년     (숫자)

	// 생성자 (속성 값 초기화)
	public Student(int studentID, String name, int age, String major, int grade ) {
		
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}



	// AA가 BB공부를 한다.
	void study() {
		System.out.println(this.name + "이(가)" + this.major + "공부를 한다.");
	}
	
	// 자기소개
	void introduce() {
		System.out.println("저는 " + this.major + " " + this.grade + "학년에 재학중인 " + this.name + "입니다.");


	}
}
















