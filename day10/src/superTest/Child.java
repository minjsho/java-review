package superTest;

public class Child extends Parents{	//Parents 클래스를 상속받는 Child 클래스 시작영역

	//필드
	int chVal;	//정수형 chVal 필드 선언

	
	//생성자
	//매개변수 1개 있는 생성자
	//=> 상속관계에서 부모클래스에 기본 생성자가 없는 경우 자식클래스를 만들면 오류 발생
	public Child(int val, int chVal) {
		super(val);		//부모생성자 불러옴, 부모생성자 매개변수에 입력받은 val 값 저장
		this.chVal = chVal;	//매개변수로 입력받은 chVal 값을 chVal 필드에 저장
		System.out.println("자식 생성자 호출"); //출력
	}
	
	//메소드
	void chMethod1() {	//chMethod1 메소드 시작
		super.pMethod1();	//부모 클래스에 있는 pMethod1 메소드 호출
		//super는 this처럼 단독적으로 사용하지는 않는다.
		//ctrl + super.는 클래스로 가고 super()는 생성자로 감
	      super.pVal = 10;	//부모클래스에 있는 pVal 필드에 10 저장
	      System.out.println(super.pVal); //부모클래스의 pVal 필드에 저장된 값 출력(10)
	      System.out.println(this.pVal); //자기자신의 pVal 필드에 저장된 값 출력(상속되었으므로 10)

		System.out.println("자식 클래스에서 메소드 호출");
	}
	
}//Child 클래스 종료
