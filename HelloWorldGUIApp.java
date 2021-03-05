import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HelloWorldGUIApp{
	public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//Desktop Window.
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300)); //Window Size.
                
                //Inside Content.
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER); //SwingConstants.CENTER. Alignment.
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}