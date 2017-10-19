package com.study.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
	private Integer x;
	private Integer y;

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	private final List<Integer> aList = new ArrayList<Integer>();
	private static final Integer[] EMPTY_CHESE_ARRAY = new Integer[0];

	public List<Integer> getStockList() {
		if (aList.isEmpty()) {
			return Collections.emptyList();
		} else {
			return new ArrayList<Integer>(aList);
		}
	}

	public Integer[] getIntegerArray() {
		return aList.toArray(EMPTY_CHESE_ARRAY);
	}

	// The right way to return an array from a collection
	private final List<Cheese> cheesesInStock = new ArrayList<Cheese>();
	private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

	/**
	 * @return an array containing all of the cheeses in the shop.
	 */
	public Cheese[] getCheeses() {
		return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
	}

	public List<Cheese> getCheeseList() {
		if (cheesesInStock.isEmpty())
			return Collections.emptyList(); // Always returns same list
		else
			return new ArrayList<Cheese>(cheesesInStock);
	}

	/*try {  // Use exceptions only for exceptional conditions
		int i = 0;
		while(true)
		range[i++].climb();
		} catch(ArrayIndexOutOfBoundsException e) {
	  }
	
	for (Mountain m : range)
		m.climb();*/
	
	
}
