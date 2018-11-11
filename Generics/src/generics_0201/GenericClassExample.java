/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics_0201;

/**
 *
 * @author Producer
 */
public class GenericClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Person <Employee> p1 = new Person<Employee>();
    	Person<Contact> p2 = new Person<Contact>();
    	
    	Employee e = new Employee("Megha", "Pathak", "5555");
    	Contact c = new Contact("Hello", "d", "f", "4444");
    	p1.setPerson(e);
    	p2.setPerson(c);
    	
    	System.out.println(p1.getPerson().toString());
    	System.out.println(p2.getPerson().toString());
    }
    
}
