package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import calculator.creator.CreatorManager;

public class FigureFactory {
	private static final String SEPARATOR_POINT = "-";
	private static final String SEPARATOR_XY = ",";

	private FigureFactory() {
	}

	public static Figure getInstance(List<Point> points) {
		return CreatorManager.getCreator(points.size())
			.create(points);
	}

	public static Figure getInstance(String input) {
		return getInstance(parse(input));
	}

	public static List<Point> parse(String input) {
		String[] points = input.replace("(", "").replace(")", "").split(SEPARATOR_POINT);

		return Arrays.stream(points)
			.map(point -> point.split(SEPARATOR_XY))
			.map(xy -> Point.create(Integer.parseInt(xy[0]), Integer.parseInt(xy[1])))
			.collect(Collectors.toList());
	}
}
