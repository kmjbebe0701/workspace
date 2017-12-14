class Board {
	
	String no;
	String title;
	String content;
	String name;
	String regDate;
	
	public Board(String no, String title, String content, String name, String regDate) {
		
		this.no = no;
		this.title = title;
		this.content = content;
		this.name = name;
		this.regDate = regDate;
		
	}
	
	
	
	
	String printBord() {
		return this.no + " " + this.title + " " + this.content + " " + this.name + " " + this.regDate;
	}
	
}