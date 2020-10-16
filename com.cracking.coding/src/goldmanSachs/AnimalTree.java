package goldmanSachs;

public abstract class AnimalTree extends Animal{

	public static void main(String[] args) {
		Animal an = new Animal() {
			
			void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Hey");
			}
		};
		
		
		an.sayHello();
	}
}
