import java.lang.Exception;
import java.lang.reflect.Array;
import java.util.Scanner;

class Students {
    private int id;
    private String name;
    private char grade;

    public Students(int id, String name, char grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentData {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create Students array at runtime
        Object studentArray = Array.newInstance(Students.class, size);

        // Add students
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Grade: ");
            char grade = sc.next().charAt(0);
//          sc.nextLine();

            // Create Students object and store it in array
            Students s = new Students(id, name, grade);
            Array.set(studentArray, i, s);
        }

        // Print all students
        System.out.println("\n=== Stored Student Records ===");
        for (int i = 0; i < Array.getLength(studentArray); i++) {
            Students s = (Students) Array.get(studentArray, i);
            System.out.println(s);
        }

        sc.close();
    }
}
