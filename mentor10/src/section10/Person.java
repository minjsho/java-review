package section10;

public class Person {
	//필드
	String name;
	int age;
	
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void parent() {
		System.out.println("c");
	}
}