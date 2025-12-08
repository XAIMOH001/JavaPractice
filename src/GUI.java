import javax.swing.*;
import java.awt.*;

public class GUI {
    GUI(){
        Frame frame = new Frame("Created Window");
//          Button button = new Button("Hello world");
        Label label = new Label("Gui in action");
        frame.add(label);
//        frame.add(button);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        GUI gui = new GUI();
    }
}
//public class GUI {
//    JFrame jf;
//    public GUI(){
//        jf = new JFrame("Created Window");
//        JButton btn = new JButton ("Sign UP");
//        jf.add(btn);
//
//        jf.setLayout(new FlowLayout());
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setSize(500,400);
//        jf.setVisible(true);
//    }
//
//    public static void main(String [] arg){
//        new GUI();
//    }
//}