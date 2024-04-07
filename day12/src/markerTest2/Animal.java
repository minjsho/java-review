package markerTest2;

public class Animal { //Animal 클래스 시작영역
	//필드
	private String name;
	//같은 클래스 내에서만 접근 가능한 name 필드 선언

	//매개변수 1개 받는 생성자
	public Animal(String name) {
		super();	//부모생성자 호출
		this.name = name;
	}

	//게터메소드 - private 필드 때문에 필요
	public String getName() {
		return name;	//name 필드에 저장된 값 반환
	} //게터 메소드 종료
	
	//일반메소드 eat
	public void eat() {
		System.out.println(this.name + "이(가) 먹는 중입니다");
		//this.name 은 name 필드
	} //eat 메소드 종료
					
}//Animal 클래스 종료
