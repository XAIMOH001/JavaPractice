public class Methods {
    static int myMethod(int x){
        return x * 2;
    }

    public static void main(String[] args){
        for(int i = 0; i <= 6; i++){
            System.out.println("Double of " + i + " is " + myMethod(i));
        }
    }
}
