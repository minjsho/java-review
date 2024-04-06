package task01;

public class Burger extends Food{

	@Override
	int calculatePrice() {
		return 3500;
	}

	@Override
	String getFoodName() {
		return "햄버거";
	}

}
