package ambiguityTest;

public class ClassB extends ClassA implements Inter1{
	//ClassA를 상속받고 inter1인터페이스로 구현한 ClassB 클래스 시작영역
	public static void main(String[] args) { //main메소드 시작영역
		ClassB b = new ClassB(); //ClassB 클래스 타입의 객체 b 생성
		b.printText(); //상속받는 클래스의 우선순위가 인터페이스 보다 더 높으므로 
						//ClassA의 printText 메소드가 호출된다!
	} //main메소드 종료 영역

} //ClassB 클래스 종료 영역
