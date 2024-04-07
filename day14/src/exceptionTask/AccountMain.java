package exceptionTask;

public class AccountMain { //AccountMain 클래스 시작영역
	//메인메소드
	//입금메소드 호출
	//출금메소드 호출
	
	public static void main(String[] args) { //main 메소드 시작영역
		Account account = new Account(); 
		//Account 클래스타입의 account 객체 생성		
		try {	//try-catch문 시작
			account.deposit(10000); //10000원 입금
			account.withdraw(15000);//15000원 출금
		} catch (MyException e) { //MyException 예외처리
			System.out.println(e.getMessage()); //객체 e의 메시지 출력
			e.printStackTrace(); //오류 추적 내용 출력
		}	//try-catch문 종료
		
	} //main 메소드 종료
	
} //AccountMain 클래스 종료
