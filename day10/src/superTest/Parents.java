package superTest;

public class Parents {	//Parents 클래스 시작영역
	//필드
	int pVal;	//정수형 pVal 필드 선언
	
	//메소드
	void pMethod1() {	//pMethod1 메소드 시작
		System.out.println("슈퍼클래스 메소드 호출"); //출력
	}	//pMethod1 메소드 종료
	
	//생성자
	public Parents(int val) {
	//모든 곳에서 접근 가능한, 정수형 val 매개변수를 가지는 Parents 생성자
		this.pVal = val;	//val 매개변수로 받은 값 pVal 필드에 저장
		System.out.println("부모 생성자 호출"); //출력
	}

} //Parents 클래스 종료
