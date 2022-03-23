package calculator;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FigureFactoryTest {

	@Test
	void 입력값으로_Points만들기() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2));

		assertThat(FigureFactory.parse("(1,1)-(1,2)")).isEqualTo(points);
	}

	@Test
	void 라인생성() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2));

		Line line = new Line(points);
		assertThat(FigureFactory.getInstance(points)).isEqualTo(line);
	}

	@Test
	void 삼각형생성() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2),
			Point.create(2, 4));

		Triangle triangle = new Triangle(points);
		assertThat(FigureFactory.getInstance(points)).isEqualTo(triangle);
	}

	@Test
	void 사각형생성() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2),
			Point.create(2, 2),
			Point.create(2, 1));

		Rectangle rectangle = new Rectangle(points);
		assertThat(FigureFactory.getInstance(points)).isEqualTo(rectangle);
	}


}
