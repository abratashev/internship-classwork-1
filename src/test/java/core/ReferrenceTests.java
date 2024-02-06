package core;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ReferrenceTests {


	/**
	 * Примитивы хранят значение, объектные типы - ссылку на объект
	 */
	@Test
	void case1PrimitivesVsObjects() {
		int a1 = 1;
		Integer a2 = 1; // Для Boxed типа - аналог вызова new Integer(1)
		assertThat(a2==a1).isTrue();
	}


	/**
	 * В Java аргументы методов всегда передаются по значению
	 */
	@Test
	void case2PassByValue() {
		Integer a = 1; // Для Boxed типа - аналог вызова new Integer(1)
		assertThat(a).isEqualTo(1);
		case2Inner(a);
		assertThat(a).isEqualTo(1);
		System.out.println(a);
	}

	void case2Inner(Integer a) {
		a = 2; // Для Boxed типа - аналог вызова new Integer(2)
		System.out.println(a);
		assertThat(a).isEqualTo(2);
	}

	/**
	 * Передача аргументов по значению не мешает менять сами объекты внутри методов
	 */
	@Test
	void case3PassByValueMutable() {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		assertThat(a).isEqualTo(List.of(1));
		System.out.println(a);
		case3Inner(a);
		assertThat(a).isEqualTo(List.of(1,2));
		System.out.println(a);
	}

	private void case3Inner(List<Integer> a) {
		a.add(2);
	}


	/**
	 * Каждая из ссылок на 1 объект меняет этот объект
	 */
	@Test
	void case4PassByMultipleReferences() {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		List<Integer> b = a;
		List<Integer> c = a;
		assertThat(a).isEqualTo(List.of(1));
		assertThat(b).isEqualTo(List.of(1));
		assertThat(c).isEqualTo(List.of(1));
		a.add(2);
		assertThat(a).isEqualTo(List.of(1,2));
		assertThat(b).isEqualTo(List.of(1,2));
		assertThat(c).isEqualTo(List.of(1,2));
	}


}
