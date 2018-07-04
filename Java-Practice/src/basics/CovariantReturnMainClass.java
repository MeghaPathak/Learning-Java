package basics;

public class CovariantReturnMainClass {
/*	
	1.Toh aisa ho sakta h ki parent class mein koi method ho jo 
	apni hi class ka reference create karke return kar rhi ho. 
	Jab aisi method ko override kar rhe ho toh java allows you ki
	aap return type change kar lo..and child class ka object return
	kar do. 
	Aisa isliye kyunki..parent can hold child class ka object.
	Hence over riding a method which returns child class ka obj 
	instead of parent class is somehwat similar to 
	Parent obj = new child() <-- which is allowed in JAVA.
	
	2. Take care that this is valid only for references. 
	Agar primitive value as a return type h for ex. int h..aur 
	aapne float kar diya toh error aajayegi.
	
	3. All rules applicable to method are valid here as well.
*/	
	public static void main(String[] args) {
		Light objLight = new Light();
		TubeLight objTubeLight = new TubeLight();
		Light objCross = new TubeLight();

		System.out.println(objLight.getInstance().getClass());
		System.out.println(objTubeLight.getInstance().getClass());
		System.out.println(objCross.getInstance().getClass());
		
		/*
		 * 	Answer
		 * 	class basics.Light
			class basics.TubeLight
			class basics.TubeLight

		 * */
	}

}
