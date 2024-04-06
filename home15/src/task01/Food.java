package task01;

public abstract class Food {
	abstract int calculatePrice();
	abstract String getFoodName();
	
	void display() {
		System.out.println("주문한 음식 : [" + this.getFoodName() 
		+  "], 가격 : [" + this.calculatePrice() + "]");
	}
}
