package exceptionTest;

public class ExceptionTest02 {//ExceptionTest02 클래스 시작영역
//	 public static void printLength(String data) {
//		 int result = data.length();
//		 System.out.println("data의 문자 개수 : " + result);
//	 }
//	 
//	 public static void main(String[] args) {
//		printLength("dfaga");
//		printLength(null);  ------> 오류 발생
//	}
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("data의 문자 개수 : " + result);
		} catch (NullPointerException e) {
			System.out.println("null 값은 개수를 셀 수 없습니다");
		} finally {
			System.out.println("예외처리 완료");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("abcd");
		printLength(null);
		System.out.println("프로그램 종료");
	}
	
	
}//ExceptionTest02 클래스 종료영역

//예외정보를 얻는 3가지 방법
//1.
//System.out.println(e.toString()); //예외 종류, 발생이유 리턴
//2.
//System.out.println(e.getMessage()); //예외 발생이유만 리턴
//3.
//e.printStackTrace(); //예외가 어디서 발생했는지 추적한 내용까지 출력