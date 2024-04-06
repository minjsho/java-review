package accessModifier2;

import accessModifier.A; //다른 패키지에 있는 A클래스 불러오기

public class Main {	//Main 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		A a = new A();			//A클래스 타입의 a 객체 생성하고 A클래스 생성자 저장
		Child c = new Child();	//Child 클래스 타입의 c 객체 생성하고 Child 생성자 저장
		
		a.var1 = 9;	//a객체의 var1 필드에 9 저장
		System.out.println(a.var1);	//콘솔창에 출력
		
		c.method();	//c객체의 method 메소드 호출 -> var1, var3 값 출력됨
		
		System.out.println(a); //a객체의 주소값 출력
		System.out.println(c); //c객체의 주소값 출력
	
	} //main 메소드 시작영역
} //Main 클래스 종료영역
