import java.awt.*;

class myFrame extends Frame{

    public myFrame(){

    }
    public void paint(Graphics g){
        g.drawString("Hello User", 100, 100);
    }
}


public class GUIDemo {
    public static void main(String[] args) {
        myFrame f1 = new myFrame();
        f1.setSize(400,600);
        f1.setVisible(true);
    }
}
