package basics;
//function access
public class MethodAccessMainClass {

	/*
	 * 1. Can I make same method name? 
	 * Yes. Overidden method gets priority.
	 * Rule is that runtime poly doesn apply on variables
	 * as in humesha left side jo h uska hi variable access hoga.
	 * but methods mein humesha right side se decide hota h
	 * 
	 * 2. variable koi bhi type ka ho : static/final/pub ho..faraq ni padta. 
	 * Humesha left side ko preference dete h.
	 * 
	 * 3. Static methods can not be over ridden. Matlab hi nahi h
	 * Static h koi method toh wo us class ko belong karti h.
	 * Toh direct class name se hi access kar lo...Over ride karke kyu method
	 * implement karoge jab aapko pata h ki object banake call hogi hi ni.
	 *
	 *4. Also private methods bhi kabhi over ride nahi ho sakti h. 
	 *par hide zarur kar sakte ho.As in same signature ki class bana sakte ho.
	 *Logic is, It is private to the class, toh jo chahhe waisa kar lo
	 *
	 *5. Final method can't be overridden.
	 *In general, static, private, final and constructors can't be over ridden.
	 *
	 *6. While overriding, it's upto you to introduce final for parameters
	 *
	 *7. You can not narrow the scope while overriding.
	 *private < default< prrotected < public
	 */

	public static void main(String args[]) {
		Light objLight = new Light();
		TubeLight objTubeLight = new TubeLight();
		Light objCross = new TubeLight();

		//Calling instance methods
		System.out.println(objLight.methodPub());
		System.out.println(objTubeLight.methodPub());
		System.out.println(objCross.methodPub());

		// Access static methods
		System.out.println(objCross.methodStaticPub());

		//Access private methods
	 	//Throws an error --->	System.out.println(objCross.methodPri());
		
		
/*		Answer
		Light:Method:methodPub
		0
		TubeLight:Method:methodPub
		0
		TubeLight:Method:methodPub
		0
		Light:Method:methodStaticPub
		0
*/

	}

}
