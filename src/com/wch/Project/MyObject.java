package com.wch.Project;

import com.wch.Abstract.Mycollect;

import java.util.ArrayList;
import java.util.Collection;

public class MyObject extends Mycollect {
	/**
	 * Constructs a list containing the elements of the specified
	 * collection, in the order they are returned by the collection's
	 * iterator.
	 *
	 * @param c         the collection whose elements are to be placed into this list
	 * @param mycollect
	 * @throws NullPointerException if the specified collection is null
	 */
	public MyObject(Collection c, ArrayList mycollect) {
		super(c, mycollect);
	}
	
	/**
	 * Constructs an empty list with an initial capacity of ten.
	 *
	 * @param mycollect
	 */
	public MyObject(ArrayList mycollect) {
		super(mycollect);
	}
	
	/**
	 * Constructs an empty list with the specified initial capacity.
	 *
	 * @param initialCapacity the initial capacity of the list
	 * @param mycollect
	 * @throws IllegalArgumentException if the specified initial capacity
	 *                                  is negative
	 */
	public MyObject(int initialCapacity, ArrayList mycollect) {
		super(initialCapacity, mycollect);
	}
}
