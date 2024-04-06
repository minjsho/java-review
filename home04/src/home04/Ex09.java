package home04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
//		입력메소드 import
//		입력문구출력
//		String 변수 선언, .next()
//		if~else if~else문, equals(), \"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 입력 : ");
		String fruit = sc.next();
		
		if(fruit.equals("사과")) {
			System.out.println("사과 : 1000원");
		}else if(fruit.equals("바나나")) {
			System.out.println("바나나 : 1500원");			
		}else {
			System.out.println("기타 : \"가격 정보 없음\"");
		}
	}

}
