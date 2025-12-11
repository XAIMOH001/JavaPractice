public class Main{
    public void fullThrow(){
        System.out.println("The car is at max speed.");
    }

    public  void maxSpeed(int s){
        System.out.println("The max speed is " + s + "KM/h.");
    }

    public static void main(String[] args){
        Main myObject = new Main();
        myObject.fullThrow();
        myObject.maxSpeed(180);
    }
}