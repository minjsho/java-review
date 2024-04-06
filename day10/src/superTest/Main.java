package superTest;

public class Main {	//Main 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		Parents p1 = new Parents(100);	
		//부모클래스 타입의 p1 객체 생성
		//부모생성자의 매개변수에 100입력하여 저장(val -> pVal)
		System.out.println(p1);	//p1 객체 주소값 출력
		System.out.println(p1.pVal);	//p1 객체의 pVal 필드 값 출력(100)
		
		System.out.println("=============");
		
		Child c1 = new Child(200, 22); //기본생성자 없으니까 Child()는 불가
		//자식클래스 타입의 c1 객체 생성하고
		//자식생성자 매개변수에 각각 저장 -> pVal=200, chVal=22
		System.out.println(c1);	//c1객체 주소값 출력
		System.out.println(c1.pVal); //c1객체의 pVal 필드값 출력(200)-상속됨
		System.out.println(c1.chVal); //c1객체의 chVal 필드값 출력(22)
		
		System.out.println("=============");
		c1.chMethod1(); //c1객체의 chMethod1 메소드 호출
		
	}//main 메소드 종료
}//Main 클래스 종료
