package typeCasting; 

public class TypeTask { //TypeTask 클래스 시작영역
	public static void main(String[] args) { //main 매소드 시작영역
//		1. 올해 년도, 월, 일을 정수형 타입의 변수로 만들고
//		올해는 0000년, 0월, 0일 입니다 형태로 출력하기
		
		int year=2024, month=3, date=12;
		//정수형 변수 year, month, data 선언하고 각각 2024, 3, 12로 초기화
		System.out.println("올해는 " + year + "년, " + month + "월, " + date + "일 입니다");
		//정수형 변수 문자열로 형변환하여 문자열과 연결해 콘솔창에 출력
		
//		2. 올해 년도를 문자열로 만든 변수 year2를 선언하고
//		24라는 값만 출력하기
		//문자열타입 year2 변수(값 year + "")
		//문자형타입 변수(2개 index2, index3 저장) charAt()
		
		String year2 = 2024 + "";	//문자열 변수 year2 선언하고 2024를 문자열로 형변환하여 저장
		char ch1 = year2.charAt(2);
		//문자형 변수 ch1 선언하고 year2에 저장된 값에서 2번째 인덱스에 해당하는 문자 저장(2)
		char ch2 = year2.charAt(3);
		//문자형 변수 ch2 선언하고 year2에 저장된 값에서 3번째 인덱스에 해당하는 문자 저장(4)
		System.out.print(ch1); //ch1에 저장된 값 콘솔창에 출력(줄바꿈 없음)
		System.out.println(ch2); //ch2에 저장된 값 콘솔창에 출력
		
		System.out.printf("%c%c\n",ch1,ch2);
		//문자열 제어문자 첫번째자리에 ch1에 저장된 값 넣고,
		//두번째자리에 ch2에 저장된 값 넣어서 출력
		//줄바꿈
		
//		3. 1번에서 만든 변수들 중 월, 일을 문자열로 바꿔서 result 변수에 저장하고
//		실수(3.12)로 변환하여 출력하기
		
		//변수선언 (변수명 result, 타입 String, 값 문자열)
		String month1 = month+".", date1 = date+"";
		//문자열 변수 month1 선언하고 month에 저장된 값을 문자열로 형변환하여 .과 연결해서 month1에 저장
		//문자열 변수 date1 선언하고 date에 저장된 값을 문자열로 형변환하여 저장
		String result = month1 + date1;
		//문자열 변수 result 선언하고 month1과 date1에 저장된 값 연결하여 저장
		System.out.println(result);	//result에 저장된 값 콘솔창에 출력(3.12)
		Double result1 = Double.parseDouble(result);
		//실수형 변수 result1 선언하고 문자열 변수 result에 저장된 값 실수형으로 형변환하여 저장
		System.out.println(result1); //result1에 저장된 값 콘솔창에 출력
		
//		 String month1 = month + ".";
//	     String date1 = date + "";
//	     System.out.println("\n"+month1 + date1);
		//줄바꾸어 month1에 저장된 값과 date1에 저장된 값 연결하여 콘솔창에 출력

	} //main 매소드 종료영역
} //TypeTask 클래스 종료영역
