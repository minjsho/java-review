package interMethod;

public class InterfaceMain { //InterfaceMain 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작영역
		MyClass mc = new MyClass(); //MyClass 클래스타입의 mc 객체 생성
		MyInterface.staticMethod(); //Myinterface의 스태틱메소드 호출
		mc.defaultMethod(); //mc 객체의 defaultMethod 메소드 호출
		mc.abstractMethod(); //mc 객체의 abstractMethod 메소드 호출
							//재정의된 내용으로 출력됨
	}//main 메소드 종료영역
}//InterfaceMain 클래스 종료영역
