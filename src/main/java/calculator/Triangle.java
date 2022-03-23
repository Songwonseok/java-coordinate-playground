package calculator;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Triangle implements Figure {
	private final List<Point> points;

	public Triangle(List<Point> points) {
		this.points = points;
	}

	@Override
	public boolean isValid(List<Point> points) {
		// TODO: 한직선상에 3점이 존재하는지 확인

		return points.stream().collect(Collectors.toSet()).size() == 3;
	}

	@Override
	public double caculator() {
		// 헤론의 공식
		double a = points.get(0).getDistance(points.get(1));
		double b = points.get(1).getDistance(points.get(2));
		double c = points.get(2).getDistance(points.get(0));
		double s = (a + b + c) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Triangle triangle = (Triangle)o;
		return Objects.equals(points, triangle.points);
	}

	@Override
	public int hashCode() {
		return Objects.hash(points);
	}
}
