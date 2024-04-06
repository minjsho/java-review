package home04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//		입력클래스 import
//		정수 변수 3개 선언
//		입력문구 출력, 입력메소드
//		if~else if~else, &&, ||
		
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2 =0, num3 =0;
		System.out.println("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		num2 = sc.nextInt();
		System.out.println("정수3 입력 : ");
		num3 = sc.nextInt();
		
		if(num1<num2 && num2<num3) {
			System.out.println("중간값 : " +num2);
		}else if(num2<num1 && num1<num3) {
			System.out.println("중간값 : " +num1);
		}else if(num1<num3 && num3<num2) {
			System.out.println("중간값 : " +num3);
		}else if(num3<num2 && num2<num1) {
		System.out.println("중간값 : " +num1);
		}else if(num3<num1 && num1<num2) {
			System.out.println("중간값 : " +num3);
		}else if(num2<num3 && num3<num1) {
			System.out.println("중간값 : " +num3);
		}else if(num1 == num2 || num2 == num3 || num1 == num3){
			System.out.println("서로 다른 세 수를 입력하세요");
		}
	}

}
