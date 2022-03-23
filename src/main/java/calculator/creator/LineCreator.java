package calculator.creator;

import java.util.List;

import calculator.Figure;
import calculator.Line;
import calculator.Point;

public class LineCreator implements FigureCreator{
	@Override
	public Figure create(List<Point> points) {
		return new Line(points);
	}
}
