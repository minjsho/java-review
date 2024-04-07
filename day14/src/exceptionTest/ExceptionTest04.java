package exceptionTest;

public class ExceptionTest04 {	//ExceptionTest04 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작영역
		try {
			Class.forName("java.lang.String"); //java.lang.String 클래스 로드
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류 시 오류 시작점부터 추적한 내용 출력됨
		}
		
		
	}//main 메소드 종료

}	//ExceptionTest04 클래스 종료
