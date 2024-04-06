package oper; 

public class OperTest02 {	//OperTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//복합대입연산자(누적연산자)
		//산술연산자, 대입연산자를 같이 쓸 때 말한다
		
//		int num =1;
//		System.out.println(num);
//		num = num + 10;
//		System.out.println(num);
//		
//		num+=10;
//		System.out.println(num);
//		
//		int num1 =5;
//		System.out.println(num1);
//		
//		System.out.println("현재 num1의 값 : "+num1);
//		num1 -= 3;		//num1 = num1 - 3
//		System.out.println("현재 num1의 값 : "+num1);
//				
//		num1 *= 25;
//		System.out.println("현재 num1의 값 : "+num1);
		
//		int money = 10000;
//		//커피 2000원 구매
//		money -= 2000;
//		//빵 2500원
//		money -= 2500;
//		
//		System.out.println(money);
//		//50000원 입금
//		money += 50000;
//		System.out.println(money);
		
		
//		1씩 증가, 1씩 감소
		int data =10;	//정수형 변수 data 선언하고 10으로 초기화
//		data = data + 1;	//data에 저장된 값에 data에 저장되어있는 값 +1 저장
//		data += 1;			//data에 저장된 값+1 한 값을 data에 다시 저장
		data++;	//data에 저장된 값 1 증가(후위형 증감연산자)
		System.out.println(data);	//11 콘솔창에 출력됨
//		System.out.println(++data);	 data 변수에 저장된 값에 먼저 1을 더하고 그 숫자 출력(전위형)	
//		System.out.println(data++); // 변수에 저장된 값 콘솔창에 출력 후 +1
		System.out.println(--data); // 변수에 저장된 값에서 -1 한 값 콘솔창에 출력
		System.out.println(data--); // 변수에 저장된 값 출력 후 -1
		System.out.println(data);	// data에 저장된 값 콘솔창에 출력
		
		int x = 1;	// 정수형 변수 x 선언하고 1로 초기화
		System.out.println(x++);	//x에 저장된 값(1) 콘솔창에 출력 후 +1 (-> x는 2됨)
		System.out.println(x);		//x에 저장된 값 콘솔창에 출력(2)
		System.out.println(--x);	//x에 저장된 값에 -1 한 후 콘솔창에 출력(1)
		System.out.println(x++ + --x + 2);
		// x++ : x에 저장된 값(1) 출력되고 다음 연산에서는 x+1 (2)로 적용됨
		// --x : x에 저장된 값(2)에서 -1 한 값 출력 (1)
		// 최종적으로 1+1+2 = 4 출력됨

	}//main 메소드 종료 영역

}//OperTest02 클래스 종료 영역
