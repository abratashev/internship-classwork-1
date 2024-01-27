package ru.liga.dpr.debug;

public class Main {
	public static void main(String[] args) {
		ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
		System.out.println(AddTwoDigits.addTwoNumbers(first, second));
	}
	
}