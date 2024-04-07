package exceptionTask;

//사용자 예외 정의 클래스
//MyException extends Exception
public class MyException extends Exception{
	//MyException 클래스 시작영역, 최상위 예외 클래스 Exception 상속받음
	
	public MyException(String message) {
	//message를 매개변수로 받는 MyException 메소드
		super(message); //부모 생성자에 message 전달하여 호출
	}
	
} //MyException 클래스 종료
