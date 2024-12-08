package zoo;

//Create at least three derived classes such as Lion, Elephant, and Monkey. Each class should extend Animal.
public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
