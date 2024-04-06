package input;

import java.util.Scanner; //입력스캐너 불러오기

public class InputTest04 { //InputTest02 클래스 시작영역
	public static void main(String[] args) { //main 메소드 시작영역
		//좋아하는 숫자 num => nextInt()
		//좋아하는 동물 animal => nextLine()
		
		int num = 0;	//정수형 변수 num 선언, 0으로 초기화
		String animal =null;	//문자열 변수 animal 선언, 초기화
		
		Scanner sc = new Scanner(System.in);	//입력클래스 sc 변수에 저장
		System.out.print("좋아하는 숫자를 입력하세요 : "); //숫자입력문구 콘솔창에 출력(문구 오른쪽에 입력받음)
		num = sc.nextInt();	//입력받은 값 num 변수에 저장
		System.out.print("좋아하는 동물을 입력하세요 : "); //동물입력문구 콘솔장에 출력(문구 오른쪽에 입력받음)
		sc.nextLine(); //이 코드가 없으면 nextLine은 엔터를 소모하기 때문에 동물을 입력하지 못하고 출력되어 버린다
		animal = sc.nextLine(); //입력받은 값 animal변수에 저장
		
		System.out.println("좋아하는 숫자는 " + num + ", "
	            + "좋아하는 동물은 " + animal + "입니다"); //문자열 연결하여 콘솔창에 출력
		
	} //main 메소드 종료영역
} //InputTest02 클래스 종료영역
