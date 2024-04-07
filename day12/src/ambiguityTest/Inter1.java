package ambiguityTest;

public interface Inter1 { //Inter1 인터페이스 시작영역
	default void printText() { //같은 패키지에서 접근 가능한 printText 메소드
		System.out.println("Inter1 인터페이스의 printText 메소드 호출");
	} //printText 메소드 종료

} //Inter1 인터페이스 종료
