package lambdaTask;

public class Main { //Main 클래스 시작영역
	//2.Main.java(클래스)에 static 메소드를 선언한다
	//-MultipleInter 타입을 반환한다
	//-이름은 calculater
	//-매개변수는 boolean타입
	//매개변수로 ture가 들어오면 두 수의 곱을 반환하는 람다식을 만들고
	//false 가 들어오면 0을 반환하는 람다식을 만든다
	//작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는
	//메소드를 만든다
	
//	static void calculater(boolean isTrue) {
//		if(!isTrue) {
//			MultipleInter mi = new MultipleInter() {
//				
//				@Override
//				public int mul(int num1, int num2) {
//					return num1*num2;
//				}
//			};
//		}else {
//			MultipleInter mi = new MultipleInter() {
//					
//				@Override
//				public int mul(int num1, int num2) {
//					return 0;
//				}
//			};
//		}
//	}
	
	//람다식 변환
	static MultipleInter calculater(boolean isTrue) {
		if(isTrue) {
			return (num1, num2) -> num1*num2;
		}else {
			 return (int num1, int num2) -> 0;
		}
	}
	
	public static void main(String[] args) {//main 메소드 시작영역
		System.out.println(calculater(true).mul(10, 2));
		System.out.println(calculater(false).mul(10, 2));
		
	}//main 메소드 종료영역
	
} //Main 클래스 종료영역
