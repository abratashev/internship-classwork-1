package ru.liga.dpr.debug;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class AddTwoDigitsTests {

	@Test
	public void test1() {
		ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode result = new ListNode(7, new ListNode(0, new ListNode(8)));
		assertThat(AddTwoDigits.addTwoNumbers(first, second)).isEqualTo(result);
	}

	@Test
	public void test2() {
		ListNode first = new ListNode(0);
		ListNode second = new ListNode(0);
		ListNode result = new ListNode(0);
		assertThat(AddTwoDigits.addTwoNumbers(first, second)).isEqualTo(result);
	}

	@Test
	public void test3() {
		ListNode first = new ListNode(
				9,
				new ListNode(
						9, new ListNode(
						9, new ListNode(
						9, new ListNode(
						9, new ListNode(
						9, new ListNode(9)
				)))))
		);
		ListNode second = new ListNode(
				9, new ListNode(
				9, new ListNode(
				9, new ListNode(9)
		)));
		ListNode result = new ListNode(
				8, new ListNode(
				9, new ListNode(
				9, new ListNode(
				9, new ListNode(
				0, new ListNode(
				0, new ListNode(
				0, new ListNode(
				1
		))))))));
		assertThat(AddTwoDigits.addTwoNumbers(first, second)).isEqualTo(result);
	}

}
