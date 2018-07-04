package basics;
//Direct variable access
public class VariableAcessMainClass {

	
	/*
	 * 1. Can I make same variable name? Rule is that runtime poly doesn't apply
	 * on variables as in humesha left side jo h uska hi variable access hoga.
	 * 
	 * 2. variable koi bhi type ka ho : static/final/pub ho..faraq ni padta. 
	 * Humesha left side ko preference dete h.
	 * 
	 * 3. private variables toh inherit honge hi nahi...toh mtlb nahi baat karke
	 */
	
	public static void main(String args[]) {
		Light objLight = new Light();
		TubeLight objTubeLight = new TubeLight();
		Light objCross = new TubeLight();

		System.out.println(objLight.pub);
		System.out.println(objTubeLight.pub);
		System.out.println(objCross.pub);

		// Access final
		System.out.println(objCross.finalStaticPub);
		
		// Answer 2 4 2 0

	}

}
