package calculator.creator;

import java.util.List;

import calculator.Figure;
import calculator.Point;
import calculator.Rectangle;

public class RectangleCreator implements FigureCreator{
	@Override
	public Figure create(List<Point> points) {
		return new Rectangle(points);
	}
}
