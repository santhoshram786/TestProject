package com.abstraction;

public abstract class Abs {

	public abstract void Bank();
	
	public void k()
	{
		System.out.println("kk");
	}
	
	//It is partial abstraction because it is having abstract method as well as non abs method
	//but in interface only we have abs methods so 100% abstraction
	//can't create abj of abs classes as well as interfaces
	//abs classes are faster than interfaces in performance wise
}
