package control;

import java.util.Scanner; //입력클래스 불러오기 

public class IfTest03 {	//IfTest03 클래스 시작영역
	public static void main(String[] args) {//main메소드 시작영역
		//if~else if~else문 
		//학생의 java 성적을 입력받아서 학점 계산하기
		//A+ : 100
		//A : 90~99
		//B : 70~89
		//C : 그외
		
		
		//입력클래스 import
		//출력메시지(입력받을)
		//변수 = 입력메소드 nextInt()
		//조건문

		Scanner sc = new Scanner(System.in); //입력클래스 sc라는 변수 선언하여 저장
		System.out.print("학생의 java 점수 입력 : "); //점수입력문구 콘솔창에 출력하고 문구 오른쪽에 입력받음
		int score = sc.nextInt(); //정수형변수 score 선언하고 입력받은 값 저장
		
		if(score == 100) {		//score에 저장된 값이 100과 같다는 조건식을 가진 if문 시작영역
			System.out.println("A+"); //조건식이 참일 때 A+ 문자열 콘솔창에 출력
		}else if(score<=99 && score>=90) { //if문 종료, 위의 조건식이 거짓일 때 실행되며
			//score에 저장된 값이 90이상이면서 99이하인 조건식을 가진 else if문 시작영역
			//java에서는 비교연산자를 연속해서 범위를 지정할 수 없다
			//논리연산자를 사용하여 두개의 비교연산을 결합해야 한다
			System.out.println("A");	//조건식이 참일 때 A 콘솔창에 출력
		}else if(score<=89 && score>=70) {	//else if문 종료, 위의 조건식들이 모두 거짓일 때 실행되며
			//score에 저장된 값이 70이상이면서 89이하인 조건식을 가진 else if문 시작영역
			System.out.println("B");	//조건식이 참일 때 B 콘솔창에 출력
		}else if(score>100 || score<0) { //else if문 종료, 위의 조건식들이 모두 거짓일 때 실행되며
			//score에 저장된 값이 100 초과이거나 0미만인 조건식을 가진 else if문 시작영역
			System.out.println("잘못된 값입니다");	//해당 문구 콘솔창에 출력
		}else {		//else if문 종료, 위의 조건식들이 모두 거짓일 때 실행되는 else문 시작영역
			System.out.println("C");	//C 콘솔창에 출력
		}	//else문 종료영역
		System.out.println("출력 끝");	//출력 끝 문구 콘솔창에 출력
	
	}//main메소드 종료영역

}//IfTest03 클래스 종료영역
