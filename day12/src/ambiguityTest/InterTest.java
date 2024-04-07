package ambiguityTest;

public class InterTest implements Inter1, Inter2, Inter3{
	//Inter1, Inter2, Inter3 인터페이스를 구현한 InterTest 클래스 시작영역
	//오버라이딩 해야함!
	
	@Override
	public void printText() { //printText 메소드 오버라이딩
		Inter1.super.printText();
		//Inter1 인터페이스의 printText 메소드 호출
	} //오버라이딩 된 printText 메소드 종료
	
	public static void main(String[] args) { //main메소드 시작영역
		InterTest it = new InterTest(); //InterTest 타입의 객체 it 생성
		it.printText(); //it 객체의 printText 메소드 호출
	}//main 메소드 종료
	
}//InterTest 클래스 종료
