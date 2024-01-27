package ru.liga.dpr.debug;

public class AddTwoDigits {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		boolean addDigit = false;
		ListNode tempL1 = l1;
		ListNode tempL2 = l2;
		ListNode result = new ListNode(0);
		ListNode tempResult = result;

		while (tempL1 != null || tempL2 != null || addDigit) {
			if (addDigit) {
				tempResult.val += 1;
				addDigit = false;
			}
			if (tempL1 != null) {
				tempResult.val += tempL1.val;
			}
			if (tempL2 != null) {
				tempResult.val += tempL2.val;
			}
			if (tempResult.val > 9) {
				tempResult.val -= 10;
				addDigit = true;
			}
			tempL1 = tempL1.next;
			tempL2 = tempL2.next;
			if (tempL1 != null || tempL2 != null || addDigit) {
				tempResult.next = new ListNode(0);
				tempResult = tempResult.next;
			}
		}
		return result;
	}

}
