package innerTest;

public class Outer {
	//외부 클래스 필드
	int var1;
	String var2;
	
	
	//외부 클래스 메소드
	void method() {
		System.out.println("외부 클래스의 메소드 호출");
	}
	
	
	class Inner{ //내부클래스 Inner
		//내부클래스의 생성자
		public Inner() {
			super();
		}
	}
	
}
