package section10;

public class Customer extends Person{
	//필드
	int memberID;

	//생성자
	public Customer(String name, int age, int memberID) {
		super(name, age);
		this.memberID = memberID;
	}
	
	
	//입장 알림 메소드
	void enter() {
		super.parent();
		System.out.println("회원번호 : " + this.memberID + " (" + super.name + ", " + super.age + "세)님 입장하셨습니다.");
	}
	
}
