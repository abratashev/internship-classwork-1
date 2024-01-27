package ide;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import ru.liga.dpr.ide.FizzBuzz;

public class FizzBuzzTests {

	@Test
	void test1() {
		assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo(List.of("1", "2", "Fizz"));
	}

	@Test
	void test2() {
		assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo(List.of("1","2","Fizz","4","Buzz"));
	}

	@Test
	void test3() {
		List<String> expected = List.of("1",
				"2",
				"Fizz",
				"4",
				"Buzz",
				"Fizz",
				"7",
				"8",
				"Fizz",
				"Buzz",
				"11",
				"Fizz",
				"13",
				"14",
				"FizzBuzz"
		);
		assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo(expected);
	}


}
