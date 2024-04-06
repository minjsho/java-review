package typeCasting; 
 
public class CastingTest01 { //CastingTest01 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
//		int, long, double, float, boolean, char
//		-> 기본자료형, 원시자료형, Primitive Type
		
//		String, 클래스 ...
//		-> 클래스자료형, 참조자료형, Reference Type
		
//		다른 자료형의 값을 문자열 자료형으로 만들기
//		+ ""(빈문자열)
//		기본자료형 : 10, 10L, 5.3, 5.3f, true, 'c'
		String str1 = 10 + "";	//문자열 변수 str1 선언 후 10을 문자열로 형변환하여 저장 
		String str2 = 5.3 + "";	//문자열 변수 str2 선언 후 5.3을 문자열로 형변환하여 저장
		String str3 = true + "";//문자열 변수 str3 선언 후 true 문자열로 형변환하여 저장
		String str4 = 'a' + "";	//문자열 변수 str4 선언 후 a 문자열로 형변환하여 저장
		System.out.println(str1+str2); //문자열 변수 str1, str2 연결하여 콘솔창에 출력(105.3)
		
		System.out.println("---------");
		
//		문자열을 다른 자료형으로 변환
		int num1 = Integer.parseInt(str1);
		//정수형 변수 num1 선언하고 str1에 저장된 문자열을 정수형으로 변환하여 저장
		double num2 = Double.parseDouble(str2);
		//실수형 변수 num2 선언하고 str2에 저장된 문자열을 실수형으로 변환하여 저장
		boolean isTrue = Boolean.parseBoolean(str3);
		//논리형 변수 isTrue 선언하고 str3에 저장된 문자열을 논리형으로 변환하여 저장
		
		System.out.println(num1+num2); //정수형 num1과 실수형 num2에 저장된 값 콘솔창에 출력(15.3)

		System.out.println("---------");
		
		char ch = str4.charAt(0);
		//문자형 변수 ch 선언하고 str4에 저장된 문자열 중 0번 인덱스에 해당하는 문자 저장
		System.out.println(ch);		//ch에 저장된 값 콘솔창에 출력 (a)
		
		char ch2 = "hello".charAt(0);
		//문자형 변수 ch2 선언하고 문자열 hello 중 0번 인덱스에 해당하는 문자 저장
		System.out.println(ch2);	//ch2에 저장된 값 콘솔창에 출력
		char ch3 = "hello".charAt(1);
		//문자형 변수 ch3 선언하고 문자열 hello 중 1번 인덱스에 해당하는 문자 저장
		System.out.println(ch3);	//ch3에 저장된 값 콘솔창에 출력
		
//		index : 문자열을 구성하는 모든 문자들에 부여된 고유번호
//		index의 시작번호는 0부터 시작한다!
		
	} //main 메소드 종료영역

} //CastingTest01 클래스 종료영역
