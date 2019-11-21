package com.interfacess;

public class Test {

	public static void main(String[] args) {

		Stars s=new Stars();
		s.Salman_khan();
		s.Trump();
		int g=s.f;
		System.out.println(g);
		int g1=America.f;
		System.out.println(g1);
		America.Arnold();
		s.anushka();
		s.Rana();
		
		s.robert();
		
		//top-casting
		America a=new Stars(); //child class object can be inherited by parent inteface ref variable
		a.Trump();
		a.robert();
		America.Arnold();
		
		
		India i=new Stars();
		America.Arnold();
		System.out.println(Stars.f);
		i.Salman_khan();
		
	
		
		//Stars s1= new America(); 	//we can't do down casting , it gives an complilation error
	}

}
