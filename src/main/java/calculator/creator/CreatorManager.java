package calculator.creator;

import java.util.Arrays;
import java.util.List;

import calculator.Point;

public enum CreatorManager {
	LINE(2, new LineCreator()),
	TRIANGLE(3, new TriangleCreator()),
	RECTANGLE(4, new RectangleCreator());

	private final int pointCount;
	private final FigureCreator figureCreator;

	CreatorManager(int pointCount, FigureCreator figureCreator) {
		this.pointCount = pointCount;
		this.figureCreator = figureCreator;
	}

	public static FigureCreator getCreator(int count) {
		return Arrays.stream(CreatorManager.values())
			.filter(f -> f.pointCount == count)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("잘못된 입력값입니다."))
			.figureCreator;
	}
}
