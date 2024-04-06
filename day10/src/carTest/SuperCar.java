package carTest;

// SuperCar : 자식클래스, 서브클래스
// Car : 부모클래스, 슈퍼클래스
// extends :상속관계를 구현하기 위해 쓰는 키워드
public class SuperCar extends Car{	//자식클래스 SuperCar는 부모클래스 Car를 상속받는다
	//부모클래스 멤버 -> 생성자에 super()라는 부모클래스의 생성자를 호출하는 부분이 있기 떄문에
//					 부모클래스 멤버를 사용할 수 있다

	//필드
	boolean booster;	//논리형 booster 필드 선언
	
	//메소드
	//boosterOn : 부스터 On 출력(매개, 리턴 없음)
	//boosterOff : 부스터 Off 출력 (")
	void boosterOn() { //boosterOn 메소드 시작
		System.out.println("부스터 On");
	} //boosterOn 메소드 종료
	void boosterOff() { //boosterOff 메소드 시작
		System.out.println("부스터 Off");
	} //boosterOff 메소드 종료
	
	
	//메소드 오버라이딩 alt shift s v
	@Override	//어노테이션
	void enginStart() { //부모인 Car클래스에 있는 enginStart메소드 오버라이딩
//		super.enginStrat(); //부모인 Car클래스의 enginStart메소드 호출
		System.out.println("시동 On!"); //다른 출력 내용으로 재정의
	}

	@Override
	void enginStop() {	//부모인 Car클래스의 enginStop매소드 오버라이딩
		super.enginStop();	//부모인 Car클래스의 enginStop메소드 호출
		System.out.println(super.toString()); //객체를 출력했을 때랑 toString 출력이랑 동일하게 나옴
		//부모의 참조값 출력
		System.out.println(this.toString()); //자신의 참조값 출력
		System.out.println(this); //자신의 주소값 출력
	}
	
	
	//생성자
	//매개변수를 4개 받는 생성자
	public SuperCar(String brand, String col, int price, boolean booster) {
	//문자열 변수 brand, col 정수형 변수 price, 논리형 변수 booster를 매개변수로하는
	//모든 곳에서 접근 가능한 SuperCar 생성자
		super(brand, col, price); //부모의 생성자의 brand, col, price 겹치니까 그대로 불러옴
		this.booster = booster; //booster 변수로 받은 값 booster 필드에 저장
	}
	
	//매개변수 1개 받는 생성자
	public SuperCar(boolean booster) { //논리형 booster 매개변수를 가지는 SuperCar 생성자
		this.booster = booster; //booster 변수로 받은 값 booster 필드에 저장
	}
	
	
//	public SuperCar(String col, int price, boolean booster) {
//		super("벤츠", col, price);
//		this.booster = booster;
//	}

	//보통 상속받았을 때는 this() 보다는 super()를 사용
	//super() this() 두개 같이 사용 불가! 하나만 사용 가능함
	
} //SuperCar 클래스 종료영역
