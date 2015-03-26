package javaswingexamples;
import javax.swing.*;
import java.awt.*;

public class ChangeBackground extends JFrame{

	  public static void main(String[] args) {
		ChangeBackground frame = new ChangeBackground();
	}
	  ChangeBackground()
	  {
		 setTitle("Backgroung Changing");
		 setSize(300,300);
		 setVisible(true);
	     setDefaultCloseOperation( EXIT_ON_CLOSE );
	     Container contentPane = getContentPane();
	     contentPane.setBackground(Color.blue);
	     
	  }
}
