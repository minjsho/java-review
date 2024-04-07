package throwTest;

public class MyException extends Exception{
	//Exception 예외클래스 상속받는 MyException 클래스 시작영역
	public MyException() {
		super("음수 입력 불가"); //출력문구
	}
}//MyException 클래스 종료
