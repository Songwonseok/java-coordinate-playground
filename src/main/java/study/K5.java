package study;

public class K5 extends Car {
	private static final int DISTANCE_PER_LITER = 13;

	public K5(int tripDistance) {
		super(tripDistance);
	}

	@Override
	double getDistancePerLiter() {
		return DISTANCE_PER_LITER;
	}
}
