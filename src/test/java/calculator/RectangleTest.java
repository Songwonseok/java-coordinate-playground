package calculator;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class RectangleTest{
	@Test
	void 생성에러() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2),
			Point.create(2, 4),
			Point.create(2, 1));

		assertThatThrownBy(() -> new Rectangle(points))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void 넓이구하기() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 4),
			Point.create(4, 4),
			Point.create(4, 1));

		Rectangle rectangle = new Rectangle(points);

		assertThat(rectangle.caculator()).isEqualTo(9);
	}

}
