package review_Car;

public class Truck extends Vehicle{
	//Vehicle 추상클래스를 상속받는 Truck 클래스 시작영역

	private int speed; //private 속도 필드
	
	@Override	//move 추상메소드 오버라이딩
	void move() {
		System.out.println("트럭 이동");
	}

	@Override	//setSpeed 추상메소드 오버라이딩
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도: " + speed);
	}

	@Override	//getSpeed 추상메소드 오버라이딩
	int getSpeed() {
		return this.speed;
	}

} //Truck 클래스 종료영역

//Truck 클래스 추상클래스 상속받는 클래스
//속도 필드(private)
//추상클래스 메소드