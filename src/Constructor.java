public class Constructor {
    int x;

    public Constructor (){
        x = 10;
    }

    public static void main(String[] args){
        Constructor c = new Constructor();
        System.out.println(c.x);
    }
}
