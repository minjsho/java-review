package task03;

public class task03 {
	//putNum 메소드 throws {
	//입력은 매개변수로 받음
	//return Integer.parseInt(매개변수)
	//}
	//main 메소드
	//try-catch 사용
	
	public static void main(String[] args) {
		
		try {
			System.out.println(putNum("ㄱㅎㅎ"));
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
			e.printStackTrace();
		}
		
	}
	
	static int putNum(String st) throws NumberFormatException{
		return Integer.parseInt(st);
	}

}
