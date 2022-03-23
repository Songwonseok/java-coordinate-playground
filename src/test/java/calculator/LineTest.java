package calculator;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LineTest {
	@Test
	void 생성에러() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2),
			Point.create(2, 2));

		assertThatThrownBy(() -> new Line(points))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void 길이구하기() {
		List<Point> points = Arrays.asList(Point.create(1, 1), Point.create(2, 2));
		Line line = new Line(points);

		assertThat(line.caculator()).isEqualTo(1.414, offset(0.00099));
	}
}
