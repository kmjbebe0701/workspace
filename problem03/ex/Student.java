class Student {
		//인스턴스 변수(Instance Variable), 멤버  변수(Member variable)
		int studentID;
		String name;
		int age;
		String major;
		int grade;
		
		public Student(int studentID, String name, int age, String major, int grade) {
			this.studentID = studentID;
			this.name = name;
			this.age = age;
			this.major = major;
			this.grade = grade;
		}
		
		
		//괄호 안에 들어가는 것들을 Parameter(Argument)라고 한다.
		//메서드(Method)
		String study() {
			return this.name + "(이)가" + this.major + "공부를 한다.";
		}
		
		String introduce() {
			return "저는" + this.major + " " + this.grade + "학년에 재학중인" + this.name + "입니다.";
		}
}