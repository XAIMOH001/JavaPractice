import java.lang.Exception;
import java.lang.reflect.Array;
import java.util.Scanner;

public class AsgnProg1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Data Type (integer, double, float, boolean, char, string):");
        String inputType = sc.next().trim();

        Class<?> type = null;

        if (inputType.equalsIgnoreCase("integer")) type = Integer.class;
        else if (inputType.equalsIgnoreCase("double")) type = Double.class;
        else if (inputType.equalsIgnoreCase("float")) type = Float.class;
        else if (inputType.equalsIgnoreCase("boolean")) type = Boolean.class;
        else if (inputType.equalsIgnoreCase("char")) type = Character.class;
        else if (inputType.equalsIgnoreCase("string")) type = String.class;
        else throw new Exception("❌ Invalid type provided");

        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        // Create array dynamically
        Object arr = Array.newInstance(type, size);

        // Fill array based on type
        for (int i = 0; i < size; i++) {
            if (type == Integer.class) {
                Array.set(arr, i, i * 10);
            }
            else if (type == Double.class) {
                Array.set(arr, i, i * 1.5);
            }
            else if (type == Float.class) {
                Array.set(arr, i, i * 2.5f);
            }
            else if (type == Boolean.class) {
                Array.set(arr, i, i % 2 == 0);   // even index = true
            }
            else if (type == Character.class) {
                Array.set(arr, i, (char) ('A' + i)); // A, B, C...
            }
            else {
                Array.set(arr, i, "Item_" + i);
            }
        }

        // Print array
        System.out.println("\n=== Array Contents ===");
        for (int i = 0; i < Array.getLength(arr); i++) {
            System.out.println(Array.get(arr, i));
        }

        sc.close();
    }
}
