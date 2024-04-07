package lambda;

public class Main { //Main 클래스 시작영역
	public static void main(String[] args) {//main 메소드 시작
		FunctionalInter fi = new FunctionalInter() { //익명클래스 시작
			
			@Override	//추상메소드 오버라이딩
			public int addTen(int number) {
				return 0;
			}
		}; //익명클래스 종료
		
		//람다식으로 전환
//		FunctionalInter fi1 = (int number) -> {return 0;};
//		FunctionalInter fi1 = number -> {return 0;};
		FunctionalInter fi1 = number -> 0;
		
		System.out.println(fi1.addTen(10)); //return 0이므로 0출력
	
	}//main 메소드 종료

} //Main 클래스 종료영역
