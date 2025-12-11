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

/*//constructor parameters
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
 */

//this keyword
public class Constructor{
    int x;
    int y;

    public Constructor(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args){
        Constructor character = new Constructor(5, 8);
        System.out.println(character.y);
        System.out.println(character.x);
    }
}

