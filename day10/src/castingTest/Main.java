package castingTest; 

public class Main {	//Main 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//자료형 변수명 = 값;
		//클래스타입 참조변수명(객체) = 참조값;	
		Tv tv = new Tv();			//부모 Tv 클래스 타입의 tv 객체 생성하고 기본생성자 저장
		SmartTv sTv = new SmartTv();//자식 SmartTv클래스 타입의 sTv 객체 생성하고 기본생성자 저장
		
		//tv 슈퍼클래스 객체 : 필드 3개 , 메소드 3개 접근가능
		//sTv 서브클래스 객체 : 필드 3개 , 메소드 4개 접근가능
		
		
//		1.Up Casting : 자식의 참조값을 부모 타입의 참조변수에 저장
		Tv t1 = new SmartTv();	//권장	//부모 Tv클래스 타입의 t1객체 생성하고 자식 SmartTv 생성자 저장(업캐스팅)
		//부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다
		//부모클래스 타입의 참조변수에 자식클래스 타입의 객체의 주소값을 저장한다
		Tv t2 = sTv;	//부모클래스타입의 객체 t2 선언하고 자식타입 객체 sTv 참조
		Tv t3 = (Tv)new SmartTv(); //부모타입의 객체 t3 선언하고 자식타입 생성자를 부모클래스 타입으로 형변환하여 참조
		System.out.println(t1); //t1 객체 주소값 출력
		System.out.println(t2); //t2 객체 주소값 출력
		System.out.println(t3); //t3 객체 주소값 출력
		
		 t1.ch = 10;	//t1객체의 ch 필드에 10 저장
	     t1.vol = 5;	//t1객체의 vol 필드에 5 저장
	     t1.power = true; //t1객체의 power 필드에 true 저장
	     t1.chUp();		//t1객체의 chUp 메소드 호출 -> 부모클래스에 있는 메소드 불러짐
//	     t1.netflex();
//	     t1 객체는 업캐스팅되었기 때문에 자식 클래스에 있는 멤버를 사용할 수 없다
	      
	     //2. Down Casting
//	     Up casting된 객체를 원래 본인의 클래스 타입으로 변환
	      
	     //강제형변환
//	     자료형 변수명 = (자료형)값;
	     int num = (int)5.2;	//정수형 변수 num 선언하고 실수 5.2를 정수로 강제 형변환 하여 저장
	     SmartTv s1 = (SmartTv) t1; //자식클래스 타입의 s1 객체 생성하고
	     							//부모클래스 타입으로 업캐스팅 된 t1 객체를 자식클래스 타입으로 강제 형변환(다운캐스팅)
	     s1.netflix();	//s1 객체의 netflix 메소드 호출
	      
	     //잘못된 DownCasting
//	     SmartTv s2 = (SmartTv)tv;
//	     System.out.println(s2);
//	     DownCasting은 반드시 Up Casting 이 된 값으로 해야한다
//	     Up casting 된 값을 다시 원래 자식 타입으로 돌리는 것이 Down Casting이다
		
	}//main메소드 종료

}//Main 클래스 종료
