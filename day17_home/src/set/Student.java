package set;

public class Student { //Student 클래스 시작 영역
	//필드
	int number;
	String name;
	
	//생성자
	//매개변수 2개 받는 생성자
	public Student(int number, String name) {
		super();	//부모 생성자 호출
		this.number = number;
		this.name = name;
	}

	
	//메소드
	//equals 메소드 재정의
	//equals(Object obj) : 객체의 동등성 비교
	//1) 먼저 객체가 자기 자신과 같은지 검사하고,
	//2) 그렇지 않은 경우 obj가 Student 클래스의 인스턴스인지 확인하고
	//번호를 기준으로 두 객체를 비교하여 동등한지 여부 반환
	
	@Override //equals 메소드 재정의
	public boolean equals(Object obj) {
	//Object 타입의 obj 객체를 매개변수로 받고
	//논리형 타입으로 반환하는 equals 메소드
		if(this == obj) { //만약 자기자신(this)이 obj와 같다면
			return true; //동등성 만족, true 반환
		} //첫번째 if문 종료
		if(obj instanceof Student) { //위 if문이 거짓일 경우
		//만약 obj가 Student 클래스의 인스턴스라면
			return this.number == ((Student)obj).number;
			//자신의 number 필드가 Student타입의 obj 객체의 number와 같다고 반환
		}//두번째 if문 종료
		return false; //두번째 if문까지 거짓이면 false 반환
	} //equals 메소드 종료
	
	@Override //equals 메소드 재정의하면 반드시 hashCode 메소드도 재정의
	public int hashCode() {
		return super.hashCode(); //부모의 해시코드 메소드 호출
	}

} //Student 클래스 종료
