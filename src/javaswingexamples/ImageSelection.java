/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaswingexamples;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ImageSelection extends JFrame{
    private JLabel label0;
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;
    private JLabel label4;
     
    ImageSelection(){
        setLayout(new BorderLayout());
        setSize(900,500);
        label0=new JLabel("Click on an image");
        label0.setFont(new Font("Serif", Font.ITALIC, 24));
        label0.setHorizontalAlignment(SwingConstants.CENTER);
        label0.setPreferredSize(new Dimension(200, 100)); 
        add(label0,BorderLayout.NORTH);
        
        image1=new ImageIcon(getClass().getResource("image1.jpg"));
        label1=new JLabel(image1);
        label1.setPreferredSize(new Dimension(300, 100)); 
        label1.addMouseListener(new MouseListener()
        { @Override
            public void mouseClicked(MouseEvent e){  label4.setText("Image Selected is called Compro Building");}
            public void mousePressed(MouseEvent e){ }
            public void mouseExited(MouseEvent e){  }
            public void mouseEntered(MouseEvent e){ }
            public void mouseReleased(MouseEvent e) {  }
        });
        add(label1,BorderLayout.WEST);
        
        image2=new ImageIcon(getClass().getResource("image2.jpg"));
        label2=new JLabel(image2);
        label2.setPreferredSize(new Dimension(300, 100));
        label2.addMouseListener(new MouseListener()
        { @Override
            public void mouseClicked(MouseEvent e){  label4.setText("Image Selected is called Dreier Building ");}
            public void mousePressed(MouseEvent e){ }
            public void mouseExited(MouseEvent e){  }
            public void mouseEntered(MouseEvent e){ }
            public void mouseReleased(MouseEvent e) {  }
        });
        add(label2,BorderLayout.CENTER);
        
        image3=new ImageIcon(getClass().getResource("image3.jpg"));
        label3=new JLabel(image3);
        label3.setPreferredSize(new Dimension(300, 100));
        label3.addMouseListener(new MouseListener()
        { @Override
            public void mouseClicked(MouseEvent e){  label4.setText("Image Selected is called Argiro Building");}
            public void mousePressed(MouseEvent e){ }
            public void mouseExited(MouseEvent e){  }
            public void mouseEntered(MouseEvent e){ }
            public void mouseReleased(MouseEvent e) {  }
        });
        add(label3,BorderLayout.EAST);
        
        label4=new JLabel("");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setPreferredSize(new Dimension(200, 100)); 
        label4.setFont(new Font("monospaced", Font.ITALIC, 20));
        label4.setForeground(Color.BLUE);
        add(label4,BorderLayout.SOUTH);
        
    }
    public static void main(String[] args){
        ImageSelection sele=new ImageSelection();
        sele.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sele.setVisible(true);
        sele.pack();
        sele.setTitle("Select an image");
    }
}
