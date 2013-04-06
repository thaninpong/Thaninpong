import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSlider;

	public class map extends JFrame{ 
		public static JFrame createMap(){
			JFrame frame = new JFrame(); 
		    JPanel panel = new JPanel();
		    Toolkit toolkit = Toolkit.getDefaultToolkit();
			Dimension screensize = toolkit.getScreenSize();
		    panel.setPreferredSize(screensize);
		    frame.add(panel);
		    frame.pack();
		    frame.setVisible(true);
		    //panel.setVisible(true);
		    panel.setLayout(new BorderLayout());
		    
		    JPanel a = new JPanel();
		    JPanel b = new JPanel();
		    a.setLayout(new BorderLayout());
		    b.setLayout(new BorderLayout());
		    panel.add(a,BorderLayout.WEST);
			a.add(b,BorderLayout.WEST);
			
			int min=0;
			int max=100;
			int init=50;
			JSlider zoom = new JSlider(JSlider.VERTICAL,min,max,init);
			b.add(zoom,BorderLayout.NORTH);

			
			JLabel mn = new JLabel();
			mn.setIcon(new ImageIcon("C:\\Users\\Thanipong\\Desktop\\123.png"));
			mn.setBounds(new Rectangle(0, 0, 30, 30));
			a.add(mn,BorderLayout.NORTH);
			
			
			JLabel log = new JLabel("Logged in : Username");
			panel.add(log,BorderLayout.SOUTH);

		    
		    return frame;
		}
		public static void main(String[] args)  
	    {  
	        createMap();  
	    }  
	}
