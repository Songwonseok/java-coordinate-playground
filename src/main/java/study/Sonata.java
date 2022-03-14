package study;

public class Sonata extends Car {
	private static final int DISTANCE_PER_LITER = 10;

	public Sonata(int tripDistance) {
		super(tripDistance);
	}

	@Override
	double getDistancePerLiter() {
		return DISTANCE_PER_LITER;
	}
}
