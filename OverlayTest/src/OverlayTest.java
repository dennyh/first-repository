import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OverlayTest
{
    public static void main(String[] args) {
    	
    	JPanel panel = new JPanel();
    	JLabel label = new JLabel("hejehejheejehejehejehejeh");
    	JTextField text = new JTextField("text field north");
    	
        JFrame frame = new JFrame("Transparent Window");
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setUndecorated(true);
        frame.setPreferredSize(new Dimension(500,500));
        frame.setMinimumSize(new Dimension(500,500));
        frame.setAlwaysOnTop(true);
        // Without this, the window is draggable from any non transparent
        // point, including points  inside textboxes.
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(text, BorderLayout.NORTH);
        frame.getContentPane().add(new JTextField("text field south"), BorderLayout.SOUTH);
        frame.setVisible(true);
        //frame.add(panel, BorderLayout.EAST);
        //frame.add(label, BorderLayout.WEST);
        
        text.setText("#SWDAFSAFAFWAFWA");
        //panel.setOpaque(false);
    }
}