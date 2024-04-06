package home04;

public class Ex02 {
	public static void main(String[] args) {
//		정수형 변수 선언, 초기화
//		반복 while
//		if문 출력, 7의배수
//		-> 7로 나눈 나머지 0, 5의 배수 -> 5로 나눈 나머지 0
//		-> %, && 사용
//		변수 1씩 증가하며 100까지 반복
		
		int num=1;
		while(num<=100) {
			if(num%7 == 0 && num%5 != 0) {
				System.out.println(num);
			}
			num++;
		}
		
	}

}
