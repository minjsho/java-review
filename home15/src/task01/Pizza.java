package task01;

public class Pizza extends Food{

	@Override
	int calculatePrice() {
		return 10000;
	}

	@Override
	String getFoodName() {
		return "피자";
	}

}
