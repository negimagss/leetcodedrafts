package amazonSolvedQs;

import java.util.HashMap;

public class Animal extends cat {
	@Override
	public void move() {
		System.out.println("Animal can move");
	}
	
	public static void main(String[] args) {
		new cat().move();
	}
//	public static void main(String[] args) {
//		HashMap<Animal, String> person = new HashMap<Animal, String>();
//		Animal animal1= new Animal("John", "John");
//		Animal animal2= new Animal("Kaine", "Mohan");
//		person.put(animal1, "person1");
//		animal2=animal1;
//		System.out.println(person.get(animal2));
//
//	}
	
	
}


class cat {
	public void move() {
		System.out.println("Cat can move and run");
	}
	
}
