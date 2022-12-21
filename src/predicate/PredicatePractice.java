package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import data.Car;

public class PredicatePractice {

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
		Stream<Car> carStream = carList.stream();

		// Filtering cars based on price
		Predicate<Car> predicate = car -> car.getPrice() == 50000;
		carStream.filter(predicate).forEach(car -> System.out.println(car.getMake() + car.getPrice()));
		carList.stream().filter(car -> car.getPrice() > 80000)
				.forEach(car -> System.out.println(car.getMake() + car.getPrice()));
		carList.stream().filter(car -> car.getPrice() < 80000 && car.getPrice() > 65000)
				.forEach(car -> System.out.println(car.getMake() + car.getPrice()));

		// Filtering cars based on color
		predicate = car -> car.getColour().contains("Black");
		carList.stream().filter(predicate)
				.forEach(car -> System.out.println(car.getMake() + car.getColour() + car.getPrice()));
		carList.stream().filter(car -> car.getColour().contains("White"))
				.forEach(car -> System.out.println(car.getMake() + car.getColour() + car.getPrice()));
		carList.stream().filter(car -> car.getColour().contains("Grey") || car.getColour().contains("Red"))
				.forEach(car -> System.out.println(car.getMake() + car.getColour() + car.getPrice()));
		// Filtering used cars
		carList.stream().filter(car -> car.getMileage() > 0)
				.forEach(car -> System.out.println(car.getMake() + car.getMileage() +"  "+ car.getMake()+car.getPrice()));
		
		
	}

}
