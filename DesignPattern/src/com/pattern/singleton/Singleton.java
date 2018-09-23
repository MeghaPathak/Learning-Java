package com.pattern.singleton;

// Need only one instance of the class
// Useful for logger class, Configurations, DB class.
public class Singleton {
	
		private static Singleton instance = null;
		private Singleton(){}
		
		public static Singleton getInstance(){
			if (instance != null){
				return instance;
			}
			return new Singleton();
		}
	
}
