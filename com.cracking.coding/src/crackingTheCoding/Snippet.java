package crackingTheCoding;




class Snippet extends ImplC implements BaseI {
	public static void main(String[] args) {
		new Snippet().method();
		
		
		try {
			Float f= new Float("3.0");
			int x= f.intValue();
			byte b = f.byteValue();
			double d = f.doubleValue();
			System.out.println(x+ b + d);
			
		}
		catch (Exception e) {
			System.out.println("Bad");
		}
		
		
		
	}
	
}

 class ImplC {
	//Please provide a few ways to scale development output and performance of a team.
   public void method() {
	   System.out.println("Inside");
   }



}

interface BaseI {
	void method();
}

