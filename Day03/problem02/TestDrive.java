public class TestDrive {
	
	//���α׷��� ������
	public static void main(String[] args) {
		Person sanghoon = 
			new Person (10, 177, "��", 32, "������", "A");


		String result1 = sanghoon.eat ("��");
		System.out.println (result1);


		String trsut2 = sanghoon.sleep ("����");
		System.out.println (result2);

		
		sanghoon.walk ("����");


		sanghoon.think ("������");

		
		int result3 = sanghoon.add (5,7);
		System.out.println (result3);

	}
}