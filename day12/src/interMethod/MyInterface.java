package interMethod;

public interface MyInterface { //MyInterfacd 인터페이스 시작영역
	//필드 -> 상수, 추상메소드
	
	void abstractMethod(); //추상메소드 abstractMethod
	
	//default 메소드
	default void defaultMethod() {
		System.out.println("디폴트 메소드");
	}

	//static 메소드
	static void staticMethod() {
		System.out.println("스태틱 메소드");
	}
} //MyInterfacd 종료
