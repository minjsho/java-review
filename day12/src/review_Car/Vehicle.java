package review_Car;

public abstract class Vehicle { //Vehicle 추상클래스 시작영역
	abstract void move(); //move 추상메소드
	
	//각각의 하위클래스에서 재정의하여 사용할 메소드이므로 추상메소드로 생성
	abstract void setSpeed(int speed);
	abstract int getSpeed(); //반환값이 있어 타입이 정해짐
	
}
//차량Vehicle 추상 클래스
//move() 이동하는 추상메소드
//setSpeed() 속도 설정 메소드(매개변수 int speed)
//getSpeed() 현재 속도 가져오는 메소드

//Car 클래스 추상클래스 상속받는 클래스
//속도 필드(private)
//추상클래스 메소드 오버라이딩

//Motorcycle 클래스 추상클래스 상속받는 클래스
//속도 필드(private)
//추상클래스 메소드

//Truck 클래스 추상클래스 상속받는 클래스
//속도 필드(private)
//추상클래스 메소드

//Review클래스
//main메소드
//moveSpeed() : 매개변수2개. 객체 생성하지 않고 생성자 이용
//모든 메소드 출력하기