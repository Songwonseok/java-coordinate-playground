package calculator.creator;

import java.util.List;

import calculator.Figure;
import calculator.Point;
import calculator.Triangle;

public class TriangleCreator implements FigureCreator{
	@Override
	public Figure create(List<Point> points) {
		return new Triangle(points);
	}
}
