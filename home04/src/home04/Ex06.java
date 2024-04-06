package home04;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//		입력클래스 import
//		입력 문구 출력
//		입력받을 String 변수 2개 선언, 결과 변수 1개
//		정수형으로 강제형변환
//		입력메소드 .next()
//		결과 변수 삼항연산자로 표현
//		출력
		
		
		Scanner sc = new Scanner(System.in);
		String word1 =null, word2 =null;
		int result =0;
		
		System.out.println("문자 입력 : ");
		word1 = sc.next();
		System.out.println("문자 입력 : ");
		word2 = sc.next();
		
		int code1 = Integer.parseInt(word1);
		int code2 = Integer.parseInt(word2);
		
		result = code1 > code2 ? code1 : code2;
		System.out.println(result);
		
	}

}
