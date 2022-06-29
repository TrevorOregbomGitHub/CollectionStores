package com.qa.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main (String[] args) {
		
		var players = new LinkedList<String>();
		
		players.add("Di Maria");
		players.add("De Bruyne");
		players.add("Chielini");
		players.add("Maldini");
		
		System.out.println(players);
	}
}
