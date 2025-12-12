
/*
//Access Parent Methods
class Animal {
    public void animalSound(){
        System.out.println("The animal makes a loud Sound");
    }
}

class Dog extends Animal{
    public void animalSound(){
        super.animalSound();//calls the parent method
        System.out.println("The dog makes a loud sound");
    }
}


public class Super {
    public static void main (String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
*/

/*//Access Parent Attributes
class Animal{
    String type = "Animal";
}
class Dog extends Animal {
    String type = "Dog";

    public void printType() {
        System.out.println(super.type); // Access parent attribute
    }
}

public class Super {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.printType();
    }
}*/


/*
//Call Parent Constructor
class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
//Note: The call to super() must be the first statement in the subclass constructor.*/
