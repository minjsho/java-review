package exceptionTask;

public class Account { //Account 클래스 시작영역
	//은행계좌 클래스 만듦
	
	//필드 : 잔고 balance private
	//생성자 :기본생성자 추가
	
	//출금 메소드 : withdraw 매개변수 1개
	//잔액보다 출금 금액이 크다면 출금불가 예외처리
	//현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력
	//입금메소드 : deposit 매개변수 1개
	//잔액에 입금된 금액 추가 후 입금된 금액은 _원입니다. 현재잔고는 _원입니다. 출력

	//모든 예외처리는 메소드를 사용하는 쪽으로 던지기
	//사용자 예외 정의 클래스
	//MyException extends Exception
	
	//필드
	private int balance;

	//생성자
	public Account() {
		super();
	}
	
	//게터세터 메소드
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	//출금 메소드 : withdraw 매개변수 1개
	//잔액보다 출금 금액이 크다면 출금불가 예외처리
	//현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력
	
	//메소드 throws MyException
	//if문(balance가 money보다 크면){
	//	throw new MyException(문구)
	//} else {
	//	balance에 money 누적하여 빼기
	//	출금문구 출력
	//}
	void withdraw(int money) throws MyException {
		if(balance<money) {
			throw new MyException("출금불가. 현재 잔고 : " + this.balance
					+ ", 부족금액 : " + (money-this.balance));
		}else {
			balance -= money;
			System.out.println(money + "원이 출금되었습니다.");
		}
	}
	
	//입금메소드 : deposit 매개변수 1개
	//잔액에 입금된 금액 추가 후 입금된 금액은 _원입니다. 현재잔고는 _원입니다. 출력
	
	//balance에 들어온 돈 누적합
	void deposit(int putmoney) {
		balance += putmoney;
		System.out.println("입금된 금액 : " + putmoney + ", 현재 잔고 : " + balance);
	}
	
}

