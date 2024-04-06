package thingTask;

public class Book extends Things{ //Things 클래스를 상속받는 Book클래스
	//필드	저자(String author)
	String author;	//문자열 author 필드 선언
	
	//셍성자	매개변수2 
	public Book(String name, String author) {
	//name과 author 매개변수로 받는 생성자
		super(name);	//부모 생성자 호출하고 매개변수 name으로 받은 값 저장
		this.author = author; //매개변수 author로 입력받은 값 author 필드에 저장
	}

	
	//메소드 오버라이딩
	//책이름 : 000	출력
	//저자 :	 000 	출력
	@Override
	void printInfo() {	//부모의 printInfo 메소드 오버라이딩
		System.out.println("책이름 : " + super.name); //재정의
		System.out.println("저자 : " + this.author); //재정의
	}

}//Book클래스 종료
