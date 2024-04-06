package accessModifier;  

public class A { //A 클래스 시작영역
	//필드
	public int var1 =1;	//모든 패키지에서 접근 가능한 정수형 변수 var1 선언하고 1로 초기화
	int var2 =2;	//(default)숨겨짐. 같은 패키지에서 접근 가능한 정수형 변수 var2 선언하고 2로 초기화
	protected int var3 =3;	//같은 패키지 또는 상속받은 자식클래스에서 접근 가능한 정수형 변수 var3 선언하고 3으로 초기화
	private int var4 =4;	//같은 클래스에서 접근 가능한 정수형 변수 var4선언하고 4로 초기화
							//다른 클래스에서 사용하고 싶으면 게터 세터 메소드로 접근
	
	
	//생성자
	public A() {	//기본생성자 A 시작영역
		super();	//부모생성자 호출
	}				//A 생성자 종료
	
	
	//메소드
	public void publicMethod() { //모든 패키지에서 접근 가능한 publicMethod 메소드 시작
		System.out.println("public 메소드 호출");	//메소드 호출 시 콘솔창에 출력될 문구
	}	//publicMethod 메소드 종료
	
	void defaultMethod() {	//같은 패키지에서 접근 가능한 defaultMethod메소드 시작
		System.out.println("default 메소드 호출");	//메소드 호출 시 콘솔창에 출력될 문구
	}	//defaultMethod 메소드 종료
	
	protected void proMethod() { //같은 패키지 또는 상속받는 자식클래스에서 접근 가능한 proMethod메소드 시작
		System.out.println("protecte 메소드 호출"); //메소드 호출 시 콘솔창에 출력될 문구
	}	//proMethod 메소드 종료


	
//	//세터 var4 필드에 값을 넣어줄 때 사용(setter메소드) - 매개변수o
//	public void setVar4(int var4) {
//		this.var4 = var4;
//	}
//	
//	//게터 var4 필드에 값을 사용해야 할 때(getter메소드) - 매개변수x
//	public int getVar4() {
//		return var4;
//	}
	
	
	//게터, 세터 단축키 : alt shift s r
	public int getVar4() {
	//private 변수를 다른 클래스에서 접근하여 불러올(반환) 수 있도록 만든 getVar4(게터)메소드 시작
		return var4;	//var4에 저장된 값 반환
	}	//getVar4 메소드 종료
	
	public void setVar4(int var4) {
	//private 변수를 다른 클래스에서 접근하여 값을 입력할 수 있도록 하기 위해 만든setVar4(세터)메소드 시작
		this.var4 = var4;	//정수형 매개변수 var4를 입력받아 var4 필드에 저장
	}	//setVar4 메소드 종료
	
} //A 클래스 종료
