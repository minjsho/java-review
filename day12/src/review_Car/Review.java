package review_Car;

public class Review { //Review 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작영역
		moveSpeed(new Car(), 5);
		moveSpeed(new Mortorcycle(), 8);
		moveSpeed(new Truck(), 10);
		
	}//main 메소드 종료영역
	
	static void moveSpeed(Vehicle vehicle, int speed) {
	//객체 생성하지 않고 생성자 이용하기 위해 static 사용
	//Vehicle 클래스 타입의 vehicle 매개변수 받고
	//모든 메소드 -> move와 속도출력 -> speed 매개변수로 받아야 함
		vehicle.move();
		vehicle.setSpeed(speed);
	}

} //Review 클래스 종료영역

//Review클래스
//main메소드
//moveSpeed() : 매개변수2개. 객체 생성하지 않고 생성자 이용
//모든 메소드 출력하기