package com.wch.Abstract;

import com.wch.Interface.ElementRepeatable;

import java.util.*;

public abstract class Mycollect<U> extends ArrayList<U> implements ElementRepeatable<U> {
	private ArrayList<U> mycollect;
	private HashMap<U,Integer> frequencyDictionary;
	
	/**
	 * Constructs a list containing the elements of the specified
	 * collection, in the order they are returned by the collection's
	 * iterator.
	 *
	 * @param c the collection whose elements are to be placed into this list
	 * @throws NullPointerException if the specified collection is null
	 */
	public Mycollect(Collection<? extends U> c, ArrayList<U> mycollect) {
		super(c);
		this.mycollect = mycollect;
		this.frequencyDictionary = this.getCountRepeatable();
	}
	
	/**
	 * Constructs an empty list with an initial capacity of ten.
	 */
	public Mycollect(ArrayList<U> mycollect) {
		this.mycollect = mycollect;
		this.frequencyDictionary = this.getCountRepeatable();
	}
	
	/**
	 * Constructs an empty list with the specified initial capacity.
	 *
	 * @param initialCapacity the initial capacity of the list
	 * @throws IllegalArgumentException if the specified initial capacity
	 *                                  is negative
	 */
	public Mycollect(int initialCapacity, ArrayList<U> mycollect) {
		super(initialCapacity);
		this.mycollect = mycollect;
		this.frequencyDictionary = this.getCountRepeatable();
	}
	
	public ArrayList<U> getMycollect() {
		return mycollect;
	}
	
	public void setMycollect(ArrayList<U> mycollect) {
		this.mycollect = mycollect;
	}
	
	public HashMap<U, Integer> getFrequencyDictionary() {
		return frequencyDictionary;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Mycollect<?> mycollect1)) return false;
		if (!super.equals(o)) return false;
		return getMycollect().equals(mycollect1.getMycollect()) && Objects.equals(getFrequencyDictionary(), mycollect1.getFrequencyDictionary());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getMycollect(), getFrequencyDictionary());
	}
	
	/**
	 * The method analyzes the collection for repeating elements to it.
	 * @return - Dictionary of repetitions of collection elements.
	 * The key is a unique element, the value is the number of repetitions in the collection.
	 */
	@Override
	public HashMap<U, Integer> getCountRepeatable() {
		HashMap<U,Integer> result = new HashMap<>();
		for (U obj: this.mycollect) {
			if (result.containsKey(obj)){
				result.put(obj, result.get(obj) + 1);
			}
			result.putIfAbsent(obj,1);
		}
		return result;
	}
}
