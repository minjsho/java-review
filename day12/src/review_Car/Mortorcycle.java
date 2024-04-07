package review_Car;

public class Mortorcycle extends Vehicle{
	//Vehicle 추상클래스를 상속받는 Mortorcycle 클래스 시작영역
	
	private int speed; //private 속도 필드

	@Override	//move 추상메소드 오버라이딩
	void move() {
		System.out.println("오토바이 이동");
	}

	@Override	//setSpeed 추상메소드 오버라이딩
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도: " +speed);
	}

	@Override	//getSpeed 추상메소드 오버라이딩
	int getSpeed() {
		return this.speed;
	}

}//Mortorcycle 클래스 종료

//Motorcycle 클래스 - 추상클래스 상속받는 클래스
//속도 필드(private)
//추상클래스 메소드