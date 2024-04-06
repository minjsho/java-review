package task05;

import java.util.Scanner;

public class Wapper {
	public static void main(String[] args) {
		//입력스캐너
		//Object 타입 이름배열, 점수배열 선언
		//for(){
		//이름 입력 문구
		//입력받은 문자열 배열 저장
		//점수 입력 문구
		//입력받은 정수 배열 저장}
		//for-each로 점수 배열에 저장된 값 하나씩 뺴기

		
		Scanner sc = new Scanner(System.in);
		Object[] arName = new Object[5];
		Object[] arScore = new Object[5];
		
		for(int i=0; i<arName.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			arName[i] = sc.next();
			System.out.print("점수를 입력하세요 : ");
			arScore[i] = sc.nextInt();
			
		}
		
		for(Object score : arScore) {
			System.out.print(score+" ");
		}
		
	}
}
