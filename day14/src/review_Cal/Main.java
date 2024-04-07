package review_Cal;

public class Main { //Main 클래스 시작영역
	public static void main(String[] args) {
		//익명클래스를 이용해서 계산기 생성
		//익명클래스는 main 메소드 안에서 선언
		
		Cal cal = new Cal() { //익명클래스 시작영역

			@Override	//추상메소드 오버라이딩
			public int add(int num1, int num2) {
				return num1 + num2; //재정의
			}

			@Override	//추상메소드 오버라이딩
			public int sub(int num1, int num2) {
				return num1-num2; //재정의
			}
			
		}; //익명클래스 종료영역
		
		System.out.println(cal.add(5, 7));
		System.out.println(cal.sub(10, 2));
		
	}//main 메소드 종료영역
} //Main 클래스 종료영역
