package abstractTest;

public class ClassB extends ClassA{ //추상클래스 ClassA를 상속받는 ClassB 클래스 시작

	@Override	//추상메소드 method1 오버라이딩
	void method1() {
		System.out.println("오버라이딩 메소드1"); //재정의
	}

}//ClassB 클래스 종료
