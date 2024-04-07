package exceptionTest;

public class ExceptionTest01 { //ExceptionTest01 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작영역
//		int result = 10/0; -> 0으로 나눌 수 없음 -> 오류 발생 -> 처리
		
//		try {
//			int result = 10/0;
//			System.out.println(result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		-----> ArithmeticException 오류 뜸
		
		try { //try-catch문 시작
			int result = 10/0;	//예외 발생 상황
		} catch (ArithmeticException e) { //해당 예외상황인 경우 실행됨
			System.out.println(e); //클래스이름과 오류내용 출력됨
			System.out.println(e.toString());
			System.out.println("0으로 나누기 불가");
		}catch(Exception e) {	//모든 예외상황에서 실행됨
			System.out.println("예외발생");
		}finally {	//예외와 관계없이 무조건 실행
			System.out.println("예외처리 완료");
		} //try-catch문 종료
		System.out.println("프로그램 종료");
		
	}//main 메소드 종료

} //ExceptionTest01 클래스 종료
