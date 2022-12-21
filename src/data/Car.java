package data;

public class Car {
	String make;
	String model;
	String colour;
	int year;
	int mileage;
	int price;

	public Car(String make, String model, String colour, int year, int mileage, int price) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColour() {
		return colour;
	}

	public int getYear() {
		return year;
	}

	public int getMileage() {
		return mileage;
	}

	public int getPrice() {
		return price;
	}

}
