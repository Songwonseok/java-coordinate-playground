package calculator;

import java.util.List;
import java.util.Objects;

public class Line implements Figure {
	List<Point> points;

	public Line(List<Point> points) {
		if(!isValid(points)) {
			throw new IllegalArgumentException("직선이 아닙니다.");
		}

		this.points = points;
	}

	@Override
	public boolean isValid(List<Point> points) {
		return points.size() == 2 && !points.get(0).equals(points.get(1));
	}

	@Override
	public double caculator() {
		return points.get(0).getDistance(points.get(1));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Line line = (Line)o;
		return Objects.equals(points, line.points);
	}

	@Override
	public int hashCode() {
		return Objects.hash(points);
	}
}
