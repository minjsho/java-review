package accessTask;

public class Animal { //Animal 클래스 시작영역
	// Animal클래스
	//필드 : protected name
	protected String name;
	//같은 패키지 또는 상속받는 자식클래스에서 접근 가능한 문자열 name 필드 선언

	//생성자 : 매개변수 없는 기본생성자
	public Animal() {	//모든 패키지에서 접근 가능한 Animal 생성자 시작영역
		super();		//부모생성자 호출
	}	//Animal 생성자 종료

	//메소드 : eat() -> 00이가 먹이를 먹습니다 출력
	void eat() {	//매개변수와 리턴값 없는 eat 메소드 시작영역
		System.out.println(this.name + "이(가) 먹이를 먹습니다"); //출력
	} //eat 메소드 종료영역
	
}//Animal 클래스 종료영역
