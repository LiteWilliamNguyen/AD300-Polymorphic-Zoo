//Inside package zoo
package zoo;

//abstract class Animal
public abstract class Animal {
    protected String name;

    //Define a constructor for Animal that accepts a String to set the name of the animal
    public Animal(String name){
        this.name = name;
    }

    //Define an abstract method makeSound() that returns nothing and takes no parameters.
    public abstract void makeSound();

    //Add a non-abstract method getName() that returns the name of the animal.
    public String getName(){
        return name;
    }

    //In the Animal class, add a new overloaded version of makeSound that takes an integer
    //representing the number of times the animal should make its sound.
    //For example, if the number is 3, the lion should print "Roar Roar Roar".
    //Create a loop to make sound in accordance to timeLoop
    public void makeSound(int timeLoop){
        for (int i = 0; i < timeLoop; i++){
            makeSound();
        }
    }
}

