import zoo.Animal;
import zoo.Lion;
import zoo.Elephant;
import zoo.Monkey;

import java.util.ArrayList;


public class ZooDemo {
    public static void main(String[] args){
        //Create an array or an ArrayList called zoo to hold these animal objects.
        Animal lion = new Lion("Simba");
        Animal elephant = new Elephant("Zumba");
        Animal monkey = new Monkey("Curious George");

        //Create ArrayList to hold animals
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(monkey);

        // Looping through the zoo and calling both versions of makeSound
        // Polymorphism: calling overridden makeSound method
        // Overloaded method to make sound 3 times
        for (Animal animal : zoo) {
            System.out.println(animal.getName() + " says:");
            animal.makeSound();
            animal.makeSound(3);
            System.out.println();
        }
    }
}
