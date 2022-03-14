package study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
	private static final String NEWLINE = System.getProperty("line.separator");

	private final List<Car> cars;

	public RentCompany() {
		this.cars = new ArrayList<Car>();
	}

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public String generateReport() {
		return cars.stream()
			.map(car -> String.format("%s : %.0f리터%s", car.getName(), car.getChargeQuantity(), NEWLINE))
			.collect(Collectors.joining());
	}
}
