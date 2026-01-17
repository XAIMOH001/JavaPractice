package javaapplication4;
import java.awt.*;
import java.awt.event.*;


class myFrame extends Frame implements MouseListener{
    int x,y;
    String msg = "";
    public myFrame(){

        addMouseListener(this);
    }
    @Override
    public void paint(Graphics g){
        g.drawString("msg", x, y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Mouse clicked at " + x + " " + y;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
public class Framing {
    public static void main(String[] args){
        myFrame f1 = new myFrame();
        f1.setSize(500,500);
        f1.setTitle("Framing");
        f1.setVisible(true);


    }
}
