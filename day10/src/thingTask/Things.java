package thingTask;

public class Things {	//Things 클래스 시작영역
	//필드 이름
	String name;	//문자열 name 필드 선언

	//생성자 매개변수1
	public Things(String name) { //문자열 name 매개변수 가지는 생성자
		super();	//부모생성자 호출
		this.name = name;	//매개변수 name으로 입력받은 값 name 필드에 저장
	}
		
	//메소드 printInfo : 이름 출력
	void printInfo() {	//printInfo 메소드 
		System.out.println("이름 : " + this.name);
	}

}//Things 클래스 종료
