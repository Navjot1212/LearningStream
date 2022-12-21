package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import data.Car;

public class CompartorPractice {

	public static void main(String[] args) {
		Car acura = new Car("Acura    ", "TLX        ", "Silver ", 2021, 20000, 25000);
		Car BMW = new Car("BMW      ", "550I       ", "Black  ", 2022, 0, 85000);
		Car cadillac = new Car("Cadillac ", "Escalade   ", "White  ", 2022, 0, 80000);
		Car dodge = new Car("Dodge    ", "Challenger ", "Red    ", 2022, 0, 75000);
		Car ford = new Car("Ford     ", "Mustang    ", "Grey   ", 2022, 0, 70000);
		Car GMC = new Car("GMC      ", "Denali     ", "Black  ", 2022, 0, 90000);
		Car mercedes = new Car("Mercedes ", "AMG-GT     ", "Black  ", 2022, 0, 185000);
		Car tesla = new Car("Tesla    ", "Model-S    ", "White  ", 2022, 0, 115000);

		/****************** Different ways to declare Stream ***********************/
		// Storing objects directly
		Stream<Car> carStream = Stream.of(acura, BMW, cadillac, dodge, ford, GMC, mercedes, tesla);
		// Storing list in a stream
		List<Car> carList = Arrays.asList(acura, BMW, cadillac, dodge, ford, GMC, mercedes, tesla);
		Stream<Car> carStreamList = carList.stream();
		// Storing array in Stream
		Car[] carArray = { acura, BMW, cadillac, dodge, ford, GMC, mercedes, tesla };
		Stream<Car> carStreamArray = Arrays.stream(carArray);
		Stream<Car> carStreamArrayCopy = Arrays.stream(carArray);

		/***************************************************************************/

		// Sorting Car with car makes with List
		// Before sorting
		carList.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// After sorting ascending order using .compareTo method
		Comparator<Car> comparator = (car1, car2) -> car1.getMake().compareTo(car2.getMake());
		carList.sort(comparator);
		carList.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// After sorting descending order using .reversed method
		comparator = comparator.reversed();
		carList.sort(comparator);
		carList.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// Sorting Car with car prices with List
		// Sorting in lowest to highest price
		comparator = (car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice());
		carList.sort(comparator);
		carList.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// Sorting in highest to lowest price
		comparator = (car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice());
		carList.sort(comparator.reversed());
		carList.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// Sorting Car with car prices with Stream
		// Sorting in lowest to highest price
		comparator = Comparator.comparing(car -> car.getPrice());
		carStream.sorted(comparator)
				.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// Sorting in highest to lowest price
		comparator = Comparator.comparing(car -> car.getPrice());
		carStreamList.sorted(comparator.reversed())
				.forEach(car -> System.out.println(car.getMake() + car.getModel() + "$" + car.getPrice()));

		// Most-expensive car
		comparator = (car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice());
		Car mostExpensiveCar = carStreamArray.max(comparator).get();
		System.out.println("Most Expensive Car : " + mostExpensiveCar.getMake() + mostExpensiveCar.getModel() + "$"
				+ mostExpensiveCar.getPrice());
		// Cheapest car
		comparator = (car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice());
		Car cheapestCar = carStreamArrayCopy.min(comparator).get();
		System.out.println(
				"Cheapest Car : " + cheapestCar.getMake() + cheapestCar.getModel() + "$" + cheapestCar.getPrice());

	}
}
