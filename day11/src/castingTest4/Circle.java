package castingTest4;

//슈퍼클래스 shape을 상속받은 서브클래스 circle
public class Circle extends Shape{

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("원을 그립니다"); //재정의
	}
	
	void cirArea(double radius) { //리턴값 없고 실수형 매개변수 radius 받는 메소드
		System.out.println("원의 넓이 : " + radius * radius * Math.PI);
	}
	
} //Circle 클래스 종료
