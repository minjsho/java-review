package task01;

public class Salad extends Food{

	@Override
	int calculatePrice() {
		return 7000;
	}

	@Override
	String getFoodName() {
		return "샐러드";
	}

}
