package castingTest4;

public class Rectangle extends Shape{ //Shape클래스 상속받는 Rectangle 클래스 시작
	//필드
	int width; //밑변 필드 선언
	int height; //높이 필드 선언
	

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("사각형을 그립니다"); //재정의
	}
	
	
	//사각형 넓이 메소드
	void rectArea(int width, int height) {
		System.out.println("사각형 넓이 : " + width*height);
	}

} //Shape클래스 상속받는 Rectangle 클래스 종료
