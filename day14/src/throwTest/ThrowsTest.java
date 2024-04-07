package throwTest;

public class ThrowsTest {
	//예외던지기
	//1~10까지 출력하는 method 메소드 -> 예외던지기
	static void method() throws InterruptedException{
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) { //main 메소드 시작
		try {
			method();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}//main 메소드 종료
	
}
