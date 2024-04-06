package thingTask;

public class Main {	//Main 클래스 시작영역
	//Main 클래스
	//main 메소드
	//부모클래스 객체 thing
	//자식클래스 객체 book
	//각 객체마다 메소드 호출
	
	public static void main(String[] args) { //main 메소드 시작영역
		Things thing = new Things("책");
		//부모클래스 타입의 thing 객체 생성하고 부모생성자 매개변수에 책 저장
		Book book = new Book("Harry Potter", "JK");
		//자식클래스 타입의 book 객체 생성하고 자식생성자 매개변수에 각각의 값 저장
		
		thing.printInfo(); //thing 객체의 printInfo 메소드 호출
		book.printInfo(); //book 객체의 printInfo 메소드 호출 -> 재정의 된 내용 출력됨
		
		
//		매개변수와 필드의 차이
//      A a = new A(10, 20);
//      a.method1(10, 30);

	} //main 메소드 종료

} //Main 클래스 종료

//	class A{
//	//필드
//	int num1;
//	int num2;
//
//	//생성자
//	public A(int num1, int num2) {
// 		this.num1 = num1;
// 		this.num2 = num2;
//	}
//
//	//메소드
//	void method1(int num1, int num2) {
// 		System.out.println(num1 + num2);
//	}
//	void method1(int num1, double num2) {
// 		System.out.println(num1 + num2);
//	}
//}

