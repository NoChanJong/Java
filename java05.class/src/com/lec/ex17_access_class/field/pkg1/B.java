package com.lec.ex17_access_class.field.pkg1;

public class B {
	public B() {
		
		A a = new A();
		a.field1 = 20; 	  // public
		a.field2 = 30; 	  // default
		// a.field3 = 20; // private (x)
		
		a.method1(); 	// public
		a.method2(); 	// default
		// a.method3(); // private(x)
	}
}
