package calculator;

import java.util.Objects;

public class Point {
	public static final int MAX_VALUE = 24;
	private final int x;
	private final int y;

	private Point(int x, int y) {
		if(!isValid(x) || !isValid(y)) {
			throw new IllegalArgumentException("좌표값은 24이하로 입력해야합니다.");
		}

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static Point create(int x, int y) {
		return new Point(x, y);
	}

	private static boolean isValid(int value) {
		return value <= MAX_VALUE;
	}


	public double getDistance(Point other) {
		return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Point point = (Point)o;
		return x == point.x && y == point.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
