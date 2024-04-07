package lambdaTask;

@FunctionalInterface	//함수형 인터페이스 어노테이션
public interface MultipleInter { //MultipleInter 인터페이스 시작영역
	int mul(int num1, int num2);
	
} //MultipleInter 인터페이스 종료영역

//두 수의 곱을 구하는 프로그램
//1. MultipleInter.java(인터페이스)에 두 수를 매개변수로 받고 
//정수값을 반환하는 추상메소드를 만든다

//2.Main.java(클래스)에 static 메소드를 선언한다
//-MultipleInter 타입을 반환한다
//-이름은 calculater
//-매개변수는 boolean타입
//매개변수로 ture가 들어오면 두 수의 곱을 반환하는 람다식을 만들고
//false 가 들어오면 0을 반환하는 람다식을 만든다
//작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는
//메소드를 만든다
