abstract class Pet {
    public abstract void makeSound();
}

class Cat extends Pet {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Pet {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

}
