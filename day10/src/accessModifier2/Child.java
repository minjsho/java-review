package accessModifier2;

import accessModifier.A; //다른 패키지에 있는 A클래스 불러오기

public class Child extends A{ //A클래스 상속받는 Child 클래스 시작영역
	//필드
	int num;	//정수형 num 필드 선언
	
	//메소드
	void method() {	//매개변수와 리턴값 없는 method 메소드 시작영역
		var1 =100; //var1 필드에 100 저장 //접근제한자 public 모든 곳에서 사용가능
//		var2 =200;	접근제한자 default이기 떄문에 다른 패키지에서 사용불가
		var3 =15;  //var3 필드에 15 저장 //protected 다른 패키지에서 사용불가, 상속관계에 있는 자식클래스라서 가능
		System.out.println(var1); //var1에 저장된 값 콘솔창에 출력
		System.out.println(var3); //var3에 저장된 값 콘솔창에 출력
	}//method 메소드 종료영역

}//Child 클래스 종료영역
