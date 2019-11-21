package com.interfacess;

public interface America {
	int f=99;
	public void Trump();
	
	public static void Arnold()
	{
		System.out.println("Gymson");
	}
	
	//we can't create the objects of interface
	//only method declation----method prototype(no method body)
	//can't create static prototype method in interface
	//but interface vars are static and final by default
	
	default void robert()
	{
		System.out.println("Heroo");
	}

}
