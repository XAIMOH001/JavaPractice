import java.lang.reflect.Array;


public class DSArrays  {
    public static void main(String[] args){
        Object arr = Array.newInstance(String.class, 8);

        for(int i = 0; i < Array.getLength(arr); i++){
            Array.set(arr, i, "Item "+ i);
        }


        for(int i = 0; i < Array.getLength(arr); i++){
            System.out.println(Array.get(arr, i));
        }


    }
}
