//Abstract class
abstract class Animal {
    public abstract void animalSound();//doesn't have a body
    public void sleep(){
        System.out.println("Zzz");
    }
}

//subclass
class Cat extends Animal {
    public void animalSound() {
        System.out.println("Meow");
    }
}

class Abstract {
    public static void main(String[] args){
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();
    }
}
