package task01;

public class Main {
	public static void main(String[] args) {
		Burger burger = new Burger();
		Pizza pizza = new Pizza();
		Salad salad = new Salad();
		
		burger.display();
		pizza.display();
		salad.display();
		
		System.out.println(burger.calculatePrice());
		System.out.println(pizza.calculatePrice());
		System.out.println(salad.calculatePrice());
		
	}

}
