package com.wch.Project;

/**
 * Class printe the object
 */
public class Printer {
	MyObject object;
	
	public Printer(MyObject object) {
		this.object = object;
	}
	
	/**
	 * the method outputs my object to the terminal
	 */
	public void printObj(){
		System.out.println("Входные данные:");
		System.out.println(object.getMycollect());
		System.out.println("Элемент = кол. повторений");
		object.getFrequencyDictionary().entrySet().forEach(System.out::println);
	}
}
