package calculator.creator;

import java.util.List;

import calculator.Figure;
import calculator.Point;

public interface FigureCreator {
	Figure create(List<Point> points);
}
