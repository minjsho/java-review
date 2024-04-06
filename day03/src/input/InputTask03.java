package input;

import java.util.Scanner;	//입력클래스 불러오기

public class InputTask03 { //InputTask03 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력하기
		//이름 : 000
		//나이 : 0
		//000님의 나이는 0살입니다
		
//		1)String 이름, int 나이 변수 선언, 초기화
//		2)입력클래스, import
//		3)이름 : 출력 print()
//		4)입력메소드 .next()
//		5)나이 : 출력
//		6)입력메소드 .next(), 문자열로 형변환
//		7)출력
		
		String name = null;		//문자열 변수 name 선언하고 초기화
		int age = 0;			//정수형 변수 age 선언하고 초기화
		//형변환 하지 않아도됨 String name =null, age=null;
		Scanner sc = new Scanner(System.in); //입력클래스를 sc라는 변수에 저장
		System.out.print("이름 : "); //이름 입력 문구 출력(줄바꿈 없이)
		name = sc.next();		//입력받은 값 name 변수에 저장
		System.out.print("나이 : "); //나이 입력 문구 출력(줄바꿈 없이)
		age = Integer.parseInt(sc.next()); //age=sc.next();
		//입력받은 값 문자열 값을 정수형으로 형변환 하여 정수형 변수 age에 저장
		System.out.printf("%s님의 나이는 %d살입니다", name, age);
		//문자열과 정수 서식문자를 포함한 문구에 각각 name, age에 저장된 값 넣어서 출력
		
		System.out.printf("\n내년의 나이는 %d살입니다",age+1);	
		//제어문자로 줄바꿈하고 정수형 서식문자에 age에 저장된 값 +1하여 문구 출력
//		System.out.printf("\n내년의 나이는 %s살입니다",Integer.parseInt(age)+1);		
//		System.out.println("내년의 나이는 "+(Integer.parseInt(age)+1)+"입니다");		
		
	} //main 메소드 끝영역

} //InputTask03 클래스 끝영역
