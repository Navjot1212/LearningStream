package data;

import java.util.Arrays;
import java.util.List;

public class PopulatingCars {

	public static void main(String[] args) {
		Car acura = new Car("Acura    ", "TLX        ", "Silver ", 2021, 20000, 25000);
		Car BMW = new Car("BMW      ", "550I       ", "Black  ", 2022, 0, 85000);
		Car cadillac = new Car("Cadillac ", "Escalade   ", "White  ", 2022, 0, 80000);
		Car dodge = new Car("Dodge    ", "Challenger ", "Red    ", 2022, 0, 75000);
		Car ford = new Car("Ford     ", "Mustang    ", "Grey   ", 2022, 0, 70000);
		Car GMC = new Car("GMC      ", "Denali     ", "Black  ", 2022, 0, 90000);
		Car mercedes = new Car("Mercedes ", "AMG-GT     ", "Black  ", 2022, 0, 185000);
		Car tesla = new Car("Tesla    ", "Model-S    ", "White  ", 2022, 0, 115000);

		List<Car> carList = Arrays.asList(acura, BMW, cadillac, dodge, ford, GMC, mercedes, tesla);

	}

}
