package superTest;

public class SuperTest01 {	//SuperTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//method1 메소드가 메모리에 올라가지 않아있기 때문에 객체 필요
		SuperTest01 st = new SuperTest01(); //객체 st 생성
		System.out.println(st);	//st객체의 주소값 출력
		st.method1();	//st객체의 method1 메소드 호출
		
	}
	
	void method1() {	//method1 메소드 
		System.out.println("method1 호출"); //출력
	}

}//SuperTest01 클래스 종료
