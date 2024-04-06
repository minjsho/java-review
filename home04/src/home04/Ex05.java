package home04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		입력클래스 import
//		입력 문구 출력
//		입력받을 변수 선언, 입력메소드 .next()
//		if~else if~else 사용하여 출력, .equals()
		
		Scanner sc = new Scanner(System.in);
		System.out.println("20과 10 사칙연산");
		System.out.print("+, -, *, / 중 하나를 입력하세요 : ");
		String cal = sc.next();
		
		if(cal.equals("+")) {
			System.out.println("20 + 10 = "+(20+10));
		}else if(cal.equals("-")) {
			System.out.println("20 - 10 = "+(20-10));
		}else if(cal.equals("*")) {
			System.out.println("20 * 10 = "+(20*10));
		}else if(cal.equals("/")) {
			System.out.println("20 / 10 = "+(20/10));
		}else {
			System.out.println("주어진 연산자 중에 입력하세요.");
		}
		
	}

}
