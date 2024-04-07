package throwTest;

public class throwTest {
	//NumberFormatException 예외 강제 발생
	
//  NumberFormatException 발생하는 경우 문자열 값을 숫자형 변환
//  String str = "123abc";
//  int number = Integer.parseInt(str);
//  System.out.println(str);
	
	public static void main(String[] args) {
		try {
		  throw new NumberFormatException();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
