package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import data.Car;

public class ConsumerPractice {

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

		// for-each method using different consumer
		// Prints cars details
		Consumer<Car> consumer = car -> System.out
				.println(car.getMake() + car.getModel() + car.getColour() + car.getYear() + " $" + car.getPrice());
		carList.forEach(car -> System.out.println(car.getMake()));
		carList.forEach(consumer);
		consumer.accept(tesla);
		consumer.accept(acura);
		consumer.accept(BMW);
		consumer.accept(GMC);

		// Print car price with 13 percent tax
		consumer = car -> System.out
				.println(car.getMake() + car.getModel() + " $" + car.getPrice() + "  hst $" + (car.getPrice() * .13));
		carList.forEach(consumer);

		// Print car price with 13 percent tax
		consumer = car -> System.out.print(car.getMake() + car.getModel());
		Consumer<Car> consumer2 = consumer
				.andThen(car -> System.out.printf("Price after tax $  %.2f \n", car.getPrice() * 1.13));
		carList.forEach(consumer2);
		carStream.forEachOrdered(consumer2);
	}

}
