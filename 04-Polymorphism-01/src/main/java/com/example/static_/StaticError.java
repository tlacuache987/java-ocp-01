package com.example.static_;


public class StaticError {
    
    private int x;
    
    public static void staticMethod() {
      /*
        x = 1; // compile error
        
        instanceMethod(); // compile error
    */
    	new StaticError().instanceMethod();
    }
    
    public void instanceMethod() {
        x = 2;
    }
}