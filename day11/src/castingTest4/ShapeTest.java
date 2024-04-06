package castingTest4;

public class ShapeTest { //ShapeTest 클래스 시작
	public static void main(String[] args) { //main 메소드 시작
		Rectangle r = new Rectangle(); //Rectangle클래스 타입의 r객체 생성
		System.out.println(r); //r객체의 주소값 출력
		
		polymorphism(new Circle()); //Circle 타입의 객체의 polymorphism 메소드 호출
		polymorphism(new Triangle()); //Triangle 타입의 객체의 polymorphism 메소드 호출
		
		
		downcasting(r); //r객체의 downcasting 메소드 호출
		downcasting(new Triangle()); //Triangle 타입의 객체의 downcasting 메소드 호출
	}
	
	
	//참조변수의 다형성 기능을 할 메소드
	static void polymorphism(Shape shape) {
		//업캐스팅 된 메소드 호출
		shape.draw();	//입력받은 shape 객체의 draw 메소드 호출
	}
	
	//다운캐스팅 기능을 할 메소드
	//instanceof 연산자를 사용하여 객체의 실제 타입을 확인하고
	//넓이를 구하는 메소드 호출
	static void downcasting(Shape shape) {
	//Shape 클래스 타입의 shape변수 받는 downcasting 메소드
	//같은 부모 클래스를 상속받는 여러 자식클래스를 받아서 사용하기 위해서
		if(shape instanceof Circle) { //입력받은 shape 객체가 Circle클래스 타입이라면
			((Circle)shape).cirArea(5);
			//shape는 부모타입이므로 Circle클래스 타입으로 다운캐스팅해서 cirArea 메소드 호출 가능
		}else if(shape instanceof Triangle) { //입력받은 shape 객체가 Triangle클래스 타입이라면
			((Triangle)shape).triArea(3, 5);
			//shape는 부모타입이므로 Triangle클래스 타입으로 다운캐스팅해서 triArea 메소드 호출 가능
		}else if(shape instanceof Rectangle){ //입력받은 shape 객체가 Rectangle클래스 타입이라면
			((Rectangle)shape).rectArea(6, 10);
			//shape는 부모타입이므로 Rectangle클래스 타입으로 다운캐스팅해서 rectArea 메소드 호출 가능
		} //elseif문 종료
	}//downcasting 메소드 종료
} //ShapeTest 클래스 종료
