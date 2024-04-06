package oper; 

public class OperTest01 { //OperTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//관계연산자
		int num1 = 10, num2 =20; //정수형 변수 num1, num2 선언하여 각각 10, 20으로 초기화
		boolean isTrue = !false; //논리형 변수 isTrue 선언하여 !false 즉, true로 초기화
		
		System.out.println(isTrue);		//isTrue에 저장된 값 콘솔창에 출력 (true)
		System.out.println(10 == 20);	//10과 20이 같다는 논리의 참 거짓 출력
		System.out.println(10 != 20);	//10과 20이 같지 않다는 논리의 참 거짓 출력
		System.out.println(num1 > num2);//num1에 저장된 값(10)이 num2에 저장된 값(20)보다 크다는 논리의 참 거짓 출력
		System.out.println(num1 < num2);//num1에 저장된 값(10)이 num2에 저장된 값(20)보다 작다는 논리의 참 거짓 출력
		
		System.out.println("=============");
		//논리연산자
		System.out.println(true && true); 	//둘 다 true인 경우 논리값 출력 -> true
		System.out.println(false && true);	//하나라도 false인 경우 -> false
		System.out.println(true && false);	//하나라도 false인 경우 -> false
		System.out.println(false && false);	//둘 다 false인 경우 -> false
		System.out.println("=============");
		System.out.println(true || true);	//둘 다 true인 경우 논리값 true 출력
		System.out.println(false || true);	//하나라도 true인 경우 -> true
		System.out.println(true || false);	//하나라도 true인 경우 -> true
		System.out.println(false || false);	//둘 다 false인 경우 -> false
		
		System.out.println("=============");
		System.out.println(num1 == 10 && num2 == num1);
		//num1이 10과 같다(true) && num2가 num1과 같다(false) -> false
		System.out.println(num1 < 15 || num2 >= 20);
		//num1이 15보다 작다(true) || num2가 20보다 크거나 같다(true) -> true
		System.out.println(num1 < 15 || num2 > 20);
		//num1이 15보다 작다(true) || num2가 20보다 크다(false) -> true
		System.out.println(num1 < 15 && num2 > 20);
		//num1이 15보다 작다(true) && num2가 20보다 크다(false) -> false
		
		System.out.println("=============");
		System.out.println(!true); //!true는 false
		System.out.println(!(num1 == 10)); // !(num1이 10과 같다) -> num1이 10과 다르다 -> false
	
	}//main 메소드 종료영역
} //OperTest01 클래스 종료영역
