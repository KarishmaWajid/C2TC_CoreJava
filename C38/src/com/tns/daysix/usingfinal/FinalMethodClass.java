package com.tns.daysix.usingfinal;

public class FinalMethodClass {

	FinalMethodClass() {
		System.out.println("This is a default constructor");
		}
		final int a = 50;
		// Final method
		final void show() {
		System.out.println("Value of a: " + a);
		}
		}
		//Program to demonstrate final method 
		public class FinalMethodClassTest extends FinalMethodClass {
		// Compile time error because we cannot override the final method 
		/*
		* @Override void show() {
		* 
		* System.out.println("This is the final method of FinalMethodEx 
		class"); }
		*/
		}

