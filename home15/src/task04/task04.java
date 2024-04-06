package task04;

import java.util.Scanner;

public class task04 {
	//입력스캐너
	//입력값 변수 저장
	//if~else if문
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%3 ==0 && num%5 ==0) {
			System.out.println("FizzBuzz");
		}else if(num%3 ==0) {
			System.out.println("Fizz");
		}else if(num%5 ==0) {
			System.out.println("Buzz");
		}else {
			try {
				System.out.println(num);
			} catch (Exception e) {
				System.out.println("숫자가 아닌 문자열이 입력되었습니다");
				e.printStackTrace();
			}
		}
		
	}
}
