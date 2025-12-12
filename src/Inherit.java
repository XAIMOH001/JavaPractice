class Vehicel{
    protected String brand = "Mazda";
    public void sound() {
        System.out.println("vuum! vuum!");
    }
}

class Car extends Vehicel {
    private String modelName = "CX5";
    public static void main (String[] args){
        Car myCar = new Car();
        myCar.sound();
        System.out.println("my " + myCar.brand + " is a " + myCar.modelName);
    }
}

