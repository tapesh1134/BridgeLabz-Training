class Animal {
	String name;
	int age;

	public void makeSound() {
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog bark");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat meow");
	}
}

class Bird extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Birds chirping");
	}
}

public class Animals {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal bird = new Bird();
		cat.makeSound();
		bird.makeSound();
		dog.makeSound();
	}
}