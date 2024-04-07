package interMethod;

public class MyClass implements MyInterface{
	//MyInterface 인터페이스를 구현한 MyClass 클래스 시작영역
	
	//MyInterface의 추상메소드 오버라이딩
	@Override
	public void abstractMethod() {
		System.out.println("추상메소드 오버라이딩"); //재정의
	}
	
}//MyClass 클래스 종료
