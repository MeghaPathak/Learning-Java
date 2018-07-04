package Constructor;

public class SuperChaining {
/*	1. Jaise hi subclass ka constructor call hota h toh sabse pehle uske parent class ka
	constructor call hona chhaiye. Thus the first class jiska constructor callhota h is the 
	Object Class.Do cases possible,
	a. Aap khud explicitly super() karke parent ka constructor call kar rhe ho..
	b. Aap nahi kar rhe..toh compiler khud super() statement insert kar dega
	par agar parent class mein default constructor nahi h toh in that case,koi bhi 
	sub class compile nahi hogi. Pg 307-308
	
*/
	public static void main(String args[]) {
		TubeLight objLight = new TubeLight(1,2,3);
		System.out.println(objLight.pub + "-" + objLight.pro + "-" + objLight.pri);

	}

}
