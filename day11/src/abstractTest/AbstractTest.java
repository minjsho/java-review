package abstractTest;

public class AbstractTest {	//AbstractTest 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
//		ClassA a = new ClassA();	//추상클래스는 직접 객체를 생성할 수 없다
		ClassA a = new ClassB();	//ClassB 타입의 객체 a를 ClassA 타입으로 up casting하여 선언		
		ClassB b = new ClassB();	//ClassB 타입의 객체 b 선언
		
		System.out.println(a);	//a객체 주소값 출력
		System.out.println(b); 	//b객체 주소값 출력
		
		a.method1(); //a객체의 method1 호출 -> 재정의 된 메소드 출력
		a.method2(); //a객체의 method2 호출
		b.method1(); //b객체의 method1 호출  -> 재정의 된 메소드 출력
		b.method2(); //b객체의 method2 호출
	}//main 메소드 종료

}//AbstractTest 클래스 종료
