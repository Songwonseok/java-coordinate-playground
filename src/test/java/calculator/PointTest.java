package calculator;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class PointTest {

	@Test
	void 생성() {
		Point point = Point.create(1,4);

		assertThat(point).isEqualTo(Point.create(1,24));
	}

	@Test
	void 생성_24초과() {
		assertThatThrownBy(() -> Point.create(25, 24))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void 거리구하기() {
		Point point1 = Point.create(1,1);
		Point point2 = Point.create(2,2);


		assertThat(point1.getDistance(point2)).isEqualTo(1.414, offset(0.00099));
	}
}
