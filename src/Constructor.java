/*
//initializing a constructor
public class Constructor {
    int x;

    public Constructor (){
        x = 10;

    public static void main(String[] args){
        Constructor c = new Constructor();
        System.out.println(c.x);
    }
}
*/

//constructor parameters
public class Constructor{
    String modelName;
    int makeYear;

    public Constructor(int year, String make){
        makeYear = year;
        modelName = make;
    }

    public static void main(String[] args){
        Constructor car1 = new Constructor(2025, "Rolls Royce");
        System.out.println("my " + car1.modelName + " " + car1.makeYear + " model");
    }
}

