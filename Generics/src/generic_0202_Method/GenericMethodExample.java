/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_0202_Method;

/**
 *
 * @author Producer
 */
public class GenericMethodExample {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"a","b"};
    
        print(a);
     countGreaterThan(a, 2); 
        //   print(b);
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem){
    	int count = 0;
    	 for (T element:list)
    	 {
    		if(element.compareTo(elem) > 0)
    			System.out.println("More than 1");
    	 }
    	 return count;
    } 
    public static<E>void print(E[] list){
    	for (E e : list){
    		System.out.println(e + " ");
    	}
    }
    
}
