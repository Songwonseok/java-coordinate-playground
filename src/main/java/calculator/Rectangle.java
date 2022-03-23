package calculator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Rectangle implements Figure{

	private final List<Point> points;

	public Rectangle(List<Point> points) {
		if(!isValid(points)) {
			throw new IllegalArgumentException("직사각형이 아닙니다.");
		}

		Collections.sort(points, (o1, o2) -> {
			if(o1.getX() == o2.getX()) {
				return Integer.compare(o1.getY(), o2.getY());
			}
			return Integer.compare(o1.getX(), o2.getX());
		});

		this.points = points;
	}

	@Override
	public boolean isValid(List<Point> points) {
		if(points.size() != 4) {
			return false;
		}

		Set<Integer> setX = points.stream().map(Point::getX).collect(Collectors.toSet());
		Set<Integer> setY = points.stream().map(Point::getY).collect(Collectors.toSet());

		return setX.size() == 2 && setY.size() == 2;
	}

	@Override
	public double caculator() {
		double height = points.get(0).getDistance(points.get(1));
		double width = points.get(0).getDistance(points.get(2));

		return height * width;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Rectangle rectangle = (Rectangle)o;
		return Objects.equals(points, rectangle.points);
	}

	@Override
	public int hashCode() {
		return Objects.hash(points);
	}
}
