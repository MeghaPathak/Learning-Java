/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics_01;
/**
 *
 * @author Producer
 */
public class SyntaxExample {
    public static void main(String[] args)
    {
    
	Pair <Integer,String> myObj = new MyOrderdPair<Integer, String>(4, "Megha");
	System.out.println(myObj.getValue());
	SyntaxExample.print(myObj.getKey(), myObj.getValue());
	print("Happy", "Birthday");
    }
    
    public static<K,V> void print(K key,V value){
    	System.out.println("Key" + key + "Value" + value);
    }
    
}
