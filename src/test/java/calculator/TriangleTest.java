package calculator;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TriangleTest {
	@Test
	void 생성에러() {
		List<Point> points = Arrays.asList(
			Point.create(1, 1),
			Point.create(1, 2),
			Point.create(2, 4),
			Point.create(2, 1));

		assertThatThrownBy(() -> new Triangle(points))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
