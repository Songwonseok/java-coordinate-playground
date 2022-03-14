package study;

public class Avante implements Car {
	private static final int DISTANCE_PER_LITER = 15;
	private final double tripDistance;

	public Avante(int tripDistance) {
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
