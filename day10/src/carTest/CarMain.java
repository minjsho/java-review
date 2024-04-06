package carTest;

public class CarMain { //CarMain 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//부모 클래스의 객체 생성
		Car c1 = new Car();	 //Car 부모클래스 타입의 c1객체 생성하고 기본생성자 저장
		Car c2 = new Car("벤틀리", "red", 7000); //Car 부모클래스 타입의 c2객체 생성하고
		//생성자의 매개변수에 각각 저장
		
		//자식 클래스의 객체 생성
		SuperCar sc1 = new SuperCar(true); //SuperCar 자식클래스 타입의 sc1객체 생성하고
		//생성자 매개변수에 true 입력하여 저장
		System.out.println(sc1.booster); //sc1객체의 booster 필드에 저장된 값 출력(true)
		
		SuperCar sc2 = new SuperCar("기아", "pink", 8000, true);
		//자식클래스 SuperCar 타입의 sc2 객체 생성하고 변수4개 받는 자식생성자에 각각의 값 저장
		
		System.out.println(c2); //c2객체의 주소값 출력
		System.out.println(sc2); //sc2객체의 주소값 출력
		c2.enginStart();	//부모클래스(슈퍼클래스) 객체 의 enginStart 메소드 호출
		sc2.enginStart();	//자식클래스(서브클래스) 객체 의 enginStart 메소드 호출
		
		System.out.println("-------------");
		c2.enginStop(); //c2객체의 enginStop 메소드 호출
		sc2.enginStop(); //sc2객체의 enginStop 메소드 호출
		
	}//main 메소드 종료영역
}//CarMain 클래스 종료영역
