package carTest; 

public class Car {	//Car 클래스 시작영역
	
	//필드
	//브랜드 색상 가격
	String brand;	//문자열 brand 필드 선언
	String col;		//문자열 col 필드 선언
	int price;		//정수형 pirce 필드 선언
	
	//메소드
	//enginStart : 시동이 켜졌습니다 출력 (매개x 리턴x)
	void enginStart() {	//enginStart 메소드 시작영역
		System.out.println(this.brand + "시동이 켜졌습니다.");
	}//enginStart 메소드 종료영역
	
	//enginStop : 시동이 꺼졌습니다 출력 ( " )
	void enginStop() { //enginStop 메소드 시작영역
		System.out.println("시동이 꺼졌습니다.");
	} //enginStop 메소드 종료영역
	
	//생성자
	//기본생성자
	public Car() { //모든 패키지에서 접근 가능한 Car 기본생성자
		super();	//부모 생성자 호출 //Object 클래스의 생성자를 찾아감
	}
	
	//매개변수 3개 있는 생성자
	public Car(String brand, String col, int price) {
	//문자열 brand 변수, 문자열 col 변수, 정수형 price 변수를 매개변수로 하는
	//모든 곳에서 접근 가능한 생성자
		super();	//부모 생성자 호출
		this.brand = brand; //입력받은 brand 값을 brand 필드에 저장
		this.col = col; //입력받은 col 값을 col 필드에 저장
		this.price = price; //입력받은 price 값을 price 필드에 저장
	}

}//Car 클래스 종료영역
