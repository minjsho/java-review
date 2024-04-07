package markerTest;

public class MarkerInterMain { //MarkerInterMain 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		SomeClass sc1 = new SomeClass("데이터");
		//SomeClass 타입의 객체 sc1 생성하고
		//SomeClass 생성자 매개변수에 값 "데이터" 전달
		
		if(sc1 instanceof Markerinterface) {
		//만약 sc1 객체가 Markerinterface 인터페이스 타입이라면
			System.out.println("sc1은 Markerinterface를 구현한 클래스");
		} else { //아니라면
			System.out.println("sc1은 Markerinterface를 구현하지 않은 클래스");
		} //else문 종료
	}//main 메소드 종료

}//MarkerInterMain 클래스 종료
