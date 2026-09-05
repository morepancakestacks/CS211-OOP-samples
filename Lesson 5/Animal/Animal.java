abstract class Animal{
    // abstract methods
    public abstract void makeSound();
    // concrete method
    public void sleep(){
        System.out.println("Zzzzzz.....");
    }
}

// sub classes
class Pig extends Animal {
    public void makeSound() {
        System.out.println("The pig says \"Oink oink!\"");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.println("The cat says \"Meow meow!\"");
    }
}