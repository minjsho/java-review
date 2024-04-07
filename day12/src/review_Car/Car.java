package review_Car;

public class Car extends Vehicle{ //Vehicle 추상클래스 상속받는 Car 클래스 시작영역

	private int speed; //private 속도 필드
	
	@Override	 //move 추상메소드 오버라이딩
	void move() {
		System.out.println("자동차 이동"); //재정의
	}

	@Override	//setSpeed 추상메소드 오버라이딩
	void setSpeed(int speed) {
		this.speed = speed;	//매개변수로 받은 speed 값 speed 필드에 저장
		System.out.println("속도: " +speed); //출력
	}

	@Override	//getSpeed 추상메소드 오버라이딩
	int getSpeed() {
		return this.speed;	//speed 필드에 저장된 값 반환
	}

}//Car 클래스 종료영역

//Car 클래스 - 추상클래스 상속받는 클래스
//속도 필드(private)
//추상클래스 메소드 오버라이딩