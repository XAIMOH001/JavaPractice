import java.io.FileReader;
import java.io.IOException;

public class ThrowKey {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("/var/home/xaimoh/IdeaProjects/java/src/text.txt")) {
            char [] a = new char[5];
            fr.read(a);
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
