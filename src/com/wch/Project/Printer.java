package com.wch.Project;

public class Printer {
	MyObject object;
	
	public Printer(MyObject object) {
		this.object = object;
	}
	
	public void printObj(){
		System.out.println("Входные данные:");
		System.out.println(object.getMycollect());
		System.out.println("Элемент = кол. повторений");
		object.getFrequencyDictionary().entrySet().forEach(System.out::println);
	}
}
