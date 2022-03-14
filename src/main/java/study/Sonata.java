package study;

public class Sonata implements Car {
	private static final int DISTANCE_PER_LITER = 10;
	private final double tripDistance;

	public Sonata(int tripDistance) {
		this.tripDistance = tripDistance;
	}

	@Override
	public double getDistancePerLiter() {
		return DISTANCE_PER_LITER;
	}

	@Override
	public double getTripDistance() {
		return tripDistance;
	}
}
